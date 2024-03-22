grammar Practica2;
//r : (IDENT | CONSTFLOAT | CONSTINT | CONSTLIT | GPC | GPC2 | JUMP) + EOF;
r : defines partes;
defines: '#define' IDENT ctes defines| ;
ctes: CONSTINT | CONSTFLOAT | CONSTLIT;
partes: part partes2;
partes2: partes | ;
part: type restpart;
blq: '{' sentlist '}';
type: 'void' | 'int' | 'float';
op: '+' | '-' | '*' | '/' | '%';
listparam: type IDENT listparam2;
listparam2: ',' type IDENT listparam2 | ;
sentlist: sent sentlist2;
sentlist2: sent sentlist2| ;
lid: IDENT lid2;
lid2: ',' IDENT lid2 | ;
lexp: exp lexp2;
lexp2: ',' exp lexp2 | ;
exp: factor exp2;
exp2: op exp exp2| ;
factor: '(' exp ')' | ctes | IDENT factor2;
factor2: '(' factor3 | ;
factor3: lexp ')' | ')';
restpart: IDENT '(' restpart2;
restpart2: listparam ')' blq | 'void' ')' blq;
sent: type lid ';'
        | 'return' exp ';'
        | IDENT sent2
        |'if' '(' lcond ')' blq 'else' blq
        | 'while' '(' lcond ')' blq
        | 'do' blq 'until' '(' lcond ')'
        | 'for' '(' IDENT '=' exp ';' lcond ';' IDENT '=' exp ')' blq;
sent2: '=' exp ';'| '(' sent3;
sent3: ')'';'| lexp ')'';';
lcond : cond lcond2 | '!' cond lcond2;
lcond2: opl lcond lcond2 | ;
opl : '||' | '&&';
cond : exp opr exp;
opr: '==' | '<' | '>' | '>=' | '<=';



IDENT: (LETTER | '$') (LETTER |DIGIT|'_'| '$')*;

CONSTINT: DECIMAL_INT | OCTAL_INT | HEXA_INT;
CONSTFLOAT: DECIMAL_REAL | OCTAL_REAL | HEXA_REAL;

DECIMAL_INT:  ('+' | '-')? DIGIT+;
DECIMAL_REAL: ('+' | '-')? DIGIT+ '.' DIGIT+;

OCTAL_INT: '0' DECIMAL_INT;
OCTAL_REAL: '0' DECIMAL_REAL;

HEXA_INT: '0x' ('+' | '-')? HEX_DIGIT+;
HEXA_REAL: '0x' ('+' | '-')? HEX_DIGIT+ '.' HEX_DIGIT+;

CONSTLIT: '\'' (ESC_SEQ | ~['])* '\'' ;

GPC: '//' ~[\r\n]* -> skip ;
// .*? indica cualquier secuencia de caracteres incluidos saltos de línea
GPC2: '/*' .*? '*/' -> skip;

JUMP: ('\r'? '\n' | ' ')+ -> skip;

// el primer \ es para que no se cierren las ''
fragment ESC_SEQ: '\\' '\'';
fragment LETTER: [a-zA-Z];
fragment HEX_DIGIT: [0-9A-F] ;
fragment DIGIT: [0-9] ;

// sintactico


