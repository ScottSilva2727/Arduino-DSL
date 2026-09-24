class Symbol:
    def __init__(self, identifier: str, pin_type: str, physical_pin: str, line: int):
        self.identifier = identifier
        self.pin_type = pin_type
        self.mode = None  # Se define mediante pinMode ('INPUT' u 'OUTPUT')
        self.physical_pin = physical_pin
        self.line = line

    def __repr__(self):
        return (f"Symbol(id='{self.identifier}', type='{self.pin_type}', "
                f"mode='{self.mode}', physical_pin='{self.physical_pin}', line={self.line})")


class SymbolTable:
    def __init__(self):
        self._symbols = {}

    def declare(self, identifier: str, pin_type: str, physical_pin: str, line: int) -> bool:
        """Agrega un nuevo simbolo a la tabla. Retorna False si ya existe."""
        if identifier in self._symbols:
            return False
        self._symbols[identifier] = Symbol(identifier, pin_type, physical_pin, line)
        return True

    def lookup(self, identifier: str) -> Symbol:
        """Busca y retorna un simbolo por su identificador."""
        return self._symbols.get(identifier, None)

    def set_mode(self, identifier: str, mode: str) -> bool:
        """Actualiza el modo de operacion de un identificador declarado."""
        symbol = self.lookup(identifier)
        if symbol:
            symbol.mode = mode
            return True
        return False

    def display(self):
        """Imprime la tabla de simbolos en formato legible."""
        print("\n" + "="*70)
        print(f"{'IDENTIFICADOR':<15} | {'TIPO':<10} | {'MODO':<10} | {'PIN FISICO':<10} | {'LINEA':<5}")
        print("="*70)
        for sym in self._symbols.values():
            mode_str = sym.mode if sym.mode else "UNDEFINED"
            print(f"{sym.identifier:<15} | {sym.pin_type:<10} | {mode_str:<10} | {sym.physical_pin:<10} | {sym.line:<5}")
        print("="*70 + "\n")