grammar ArduinoDSL;

// --- REGLAS SINTACTICAS ---
program
    : statement* EOF
    ;

statement
    : pinDecl
    | pinModeConfig
    | digitalWriteCmd
    | digitalReadCmd
    | delayCmd
    ;

pinDecl
    : 'pin' PIN_TYPE IDENTIFIER '=' pinSpec ';'
    ;

pinSpec
    : INT
    | ANALOG_PIN
    ;

pinModeConfig
    : 'pinMode' '(' pinRef ',' MODE ')' ';'
    ;

digitalWriteCmd
    : 'digitalWrite' '(' pinRef ',' STATE ')' ';'
    ;

digitalReadCmd
    : 'digitalRead' '(' pinRef ')' ';'
    ;

delayCmd
    : 'delay' '(' INT ')' ';'
    | 'delay' '(' '-' INT ')' ';'
    ;

pinRef
    : IDENTIFIER
    | pinSpec
    ;

// --- REGLAS LEXICAS ---
PIN_TYPE : 'digital' | 'analog' ;
MODE     : 'INPUT' | 'OUTPUT' ;
STATE    : 'HIGH' | 'LOW' ;

ANALOG_PIN : 'A' [0-5] ;
IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;
INT        : [0-9]+ ;

WS         : [ \t\r\n]+ -> skip ;
COMMENT    : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;