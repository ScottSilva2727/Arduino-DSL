from antlr4 import InputStream, CommonTokenStream
from ArduinoDSLLexer import ArduinoDSLLexer
from ArduinoDSLParser import ArduinoDSLParser
from semantic_analyzer import SemanticAnalyzer

def run_test(case_name: str, code: str):
    print(f"\n==================================================")
    print(f" EJECUTANDO: {case_name}")
    print(f"==================================================")
    print("Codigo fuente:")
    print(code.strip())
    print("-" * 50)

    input_stream = InputStream(code)
    lexer = ArduinoDSLLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ArduinoDSLParser(token_stream)
    
    tree = parser.program()

    # Ejecutar analisis semantico
    analyzer = SemanticAnalyzer()
    analyzer.visit(tree)

    # Imprimir Tabla de Simbolos
    analyzer.symbol_table.display()

    # Imprimir Reporte
    if analyzer.warnings:
        print("--- ADVERTENCIAS ---")
        for warn in analyzer.warnings:
            print(warn)
        print()

    if analyzer.errors:
        print("--- REPORTE DE ERRORES ---")
        for err in analyzer.errors:
            print(err)
    else:
        print("--- RESULTADO: Analisis Semantico Exitoso (Sin Errores) ---")


if __name__ == "__main__":
    # Caso 1: Programa valido
    c1 = """
    pin digital ledRed = 13;
    pin analog sensorTemp = A0;
    pinMode(ledRed, OUTPUT);
    pinMode(sensorTemp, INPUT);
    digitalWrite(ledRed, HIGH);
    digitalRead(sensorTemp);
    delay(1000);
    """

    # Caso 2: Pin inexistente
    c2 = """
    pin digital led1 = 99;
    pin analog sen1 = A8;
    """

    # Caso 3: Identificador duplicado
    c3 = """
    pin digital led1 = 12;
    pin digital led1 = 11;
    """

    # Caso 4: Identificador no declarado
    c4 = """
    pinMode(ledDesconocido, OUTPUT);
    digitalWrite(ledDesconocido, HIGH);
    """

    # Caso 5: Escritura en entrada
    c5 = """
    pin digital boton = 2;
    pinMode(boton, INPUT);
    digitalWrite(boton, HIGH);
    """

    # Caso 6: Lectura de salida
    c6 = """
    pin digital led = 12;
    pinMode(led, OUTPUT);
    digitalRead(led);
    """

    # Caso 7: Retardo negativo
    c7 = """
    delay(-500);
    """

    # Caso 8: Uso de pin 0 o 1 (Advertencia)
    c8 = """
    pin digital serialRx = 0;
    pinMode(serialRx, INPUT);
    """

    test_cases = [
        ("Caso 1: Programa Valido", c1),
        ("Caso 2: Pin Inexistente", c2),
        ("Caso 3: Identificador Duplicado", c3),
        ("Caso 4: Identificador No Declarado", c4),
        ("Caso 5: Escritura en Entrada", c5),
        ("Caso 6: Lectura de Salida", c6),
        ("Caso 7: Retardo Negativo", c7),
        ("Caso 8: Uso de Pin 0 o 1 (Serial)", c8)
    ]

    for name, code in test_cases:
        run_test(name, code)