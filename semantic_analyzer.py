from ArduinoDSLVisitor import ArduinoDSLVisitor
from ArduinoDSLParser import ArduinoDSLParser
from symbol_table import SymbolTable
from arduino_catalog import ArduinoUnoCatalog

class SemanticAnalyzer(ArduinoDSLVisitor):
    def __init__(self):
        self.symbol_table = SymbolTable()
        self.errors = []
        self.warnings = []

    def _add_error(self, line: int, message: str):
        self.errors.append(f"[ERROR Semantico - Linea {line}]: {message}")

    def _add_warning(self, line: int, message: str):
        self.warnings.append(f"[ADVERTENCIA - Linea {line}]: {message}")

    def visitPinDecl(self, ctx: ArduinoDSLParser.PinDeclContext):
        pin_type = ctx.PIN_TYPE().getText()
        identifier = ctx.IDENTIFIER().getText()
        physical_pin = ctx.pinSpec().getText()
        line = ctx.start.line

        if not ArduinoUnoCatalog.is_valid_pin(physical_pin, pin_type):
            self._add_error(line, f"El pin fisico '{physical_pin}' no existe o no es de tipo '{pin_type}' en Arduino Uno.")

        if ArduinoUnoCatalog.is_serial_pin(physical_pin):
            self._add_warning(line, f"El uso del pin '{physical_pin}' puede interferir con la comunicacion Serial (UART/TX/RX).")

        if not self.symbol_table.declare(identifier, pin_type, physical_pin, line):
            self._add_error(line, f"El identificador '{identifier}' ya ha sido declarado anteriormente.")

        return self.visitChildren(ctx)

    def visitPinModeConfig(self, ctx: ArduinoDSLParser.PinModeConfigContext):
        target = ctx.pinRef().getText()
        mode = ctx.MODE().getText()
        line = ctx.start.line

        symbol = self.symbol_table.lookup(target)
        if symbol:
            symbol.mode = mode
        else:
            if not (ArduinoUnoCatalog.is_valid_pin(target, "digital") or ArduinoUnoCatalog.is_valid_pin(target, "analog")):
                self._add_error(line, f"Identificador no declarado o pin invalido '{target}'.")

        return self.visitChildren(ctx)

    def visitDigitalWriteCmd(self, ctx: ArduinoDSLParser.DigitalWriteCmdContext):
        target = ctx.pinRef().getText()
        line = ctx.start.line

        symbol = self.symbol_table.lookup(target)
        if symbol:
            if symbol.mode != "OUTPUT":
                self._add_error(line, f"Escritura ('digitalWrite') en el pin '{target}' que no está configurado como 'OUTPUT' (Modo actual: {symbol.mode}).")
        else:
            if not (ArduinoUnoCatalog.is_valid_pin(target, "digital") or ArduinoUnoCatalog.is_valid_pin(target, "analog")):
                self._add_error(line, f"Referencia a identificador no declarado o pin inexistente '{target}'.")

        return self.visitChildren(ctx)

    def visitDigitalReadCmd(self, ctx: ArduinoDSLParser.DigitalReadCmdContext):
        target = ctx.pinRef().getText()
        line = ctx.start.line

        symbol = self.symbol_table.lookup(target)
        if symbol:
            if symbol.mode != "INPUT":
                self._add_error(line, f"Lectura ('digitalRead') en el pin '{target}' que no está configurado como 'INPUT' (Modo actual: {symbol.mode}).")
        else:
            if not (ArduinoUnoCatalog.is_valid_pin(target, "digital") or ArduinoUnoCatalog.is_valid_pin(target, "analog")):
                self._add_error(line, f"Referencia a identificador no declarado o pin inexistente '{target}'.")

        return self.visitChildren(ctx)

    def visitDelayCmd(self, ctx: ArduinoDSLParser.DelayCmdContext):
        line = ctx.start.line
        # Si la instruccion contiene el signo menos '-'
        if '-' in ctx.getText():
            val = ctx.INT().getText()
            self._add_error(line, f"El tiempo de retardo en 'delay' no puede ser negativo (-{val}).")
        
        return self.visitChildren(ctx)