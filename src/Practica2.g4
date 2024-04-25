grammar Practica2;


@members {
 private Program program = new Program();
}

program : defines partes;
defines: '#define' IDENT ctes {System.out.println("A"); program.addConstant($ctes.constante, $IDENT.text);} defines
            | ;
ctes returns [String constante]: CONSTINT {$constante = $CONSTINT.text;} | CONSTFLOAT {$constante = $CONSTFLOAT.text;} | CONSTLIT {$constante = $CONSTLIT.text;} ;
partes: part partes2;
partes2: partes | ;
part: type restpart;
blq: '{' sentlist '}';
type returns [String tipo]: 'void' {$tipo = "void";}| 'int' {$tipo = "int";}| 'float' {$tipo = "float";};
op returns [String operacion]: '+' {$operacion = "+";}| '-' {$operacion = "-";} | '*' {$operacion = "*";} | '/' {$operacion = "/";}| '%'{$operacion = "%";};
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
sent: type lid ';' | 'return' exp ';'
                   | IDENT sent2
                   | 'if' '(' lcond ')' blq 'else' blq
                   | 'while' '(' lcond ')' blq
                   | 'do' blq 'until' '(' lcond ')'
                   | 'for' '(' IDENT '=' exp ';' lcond ';' IDENT '=' exp ')' blq;
sent2: '=' exp ';'| '(' sent3;
sent3: ')'';'| lexp ')'';';
lcond : cond lcond2 | '!' cond lcond2;
lcond2: opl lcond lcond2 | ; //call to lcond2 is probably unneccesary
opl returns [String andOr]: '||' {$andOr = "||";} | '&&' {$andOr = "&&";};
cond : exp opr exp;
opr returns [String comparacion]: '==' {$comparacion = "==";}| '<' {$comparacion = "<";}| '>' {$comparacion = ">";}| '>=' {$comparacion = ">=";}| '<=' {$comparacion = "<=";};



IDENT: (LETTER | '$') (LETTER |DIGIT|'_'| '$')*;

CONSTINT: DECIMAL_INT | OCTAL_INT | HEXA_INT;
CONSTFLOAT: DECIMAL_REAL | OCTAL_REAL | HEXA_REAL;

DECIMAL_INT:  ('+' | '-')? DIGIT+;
DECIMAL_REAL: ('+' | '-')? DIGIT+ '.' DIGIT+;

OCTAL_INT: '0' ('+' | '-')? OCT_DIGIT+;
OCTAL_REAL: '0' ('+' | '-')? OCT_DIGIT+ '.' OCT_DIGIT+;

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
fragment OCT_DIGIT: [0-7] ;
fragment DIGIT: [0-9] ;