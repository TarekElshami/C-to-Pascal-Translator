grammar Practica2;

@parser::header{
import classes.Program;
import classes.Blq;
import classes.declarations.*;

import java.util.ArrayList;
import java.util.List;
}
@parser::members {
 private Program program = new Program();
 private Blq currentBlq = new Blq();
}

program : defines partes;
defines: '#define' IDENT ctes
{
    VarDcl constant = new VarDcl();
    constant.setName($IDENT.text);
    constant.setValue($ctes.constante);
    constant.setType(null);

    program.getBlq().addDcl(constant);
} defines| ;
ctes returns [String constante]: CONSTINT {$constante = $CONSTINT.text;} | CONSTFLOAT {$constante = $CONSTFLOAT.text;} | CONSTLIT {$constante = $CONSTLIT.text;} ;
partes: part partes2;
partes2: partes | ;
part: type restpart
{
    MethodDcl method = new MethodDcl();
    method.setType($type.tipo);
    method.setName($restpart.name);
    method.setListParam($restpart.params);
    method.setBlock($restpart.block);

    if ("main".equals(method.getName())) {
        program.setHasMain(true);
        program.getBlock().setSentList(method.getBlock().getSentList());
    } else {
        program.getBlock().addDcl(method);
    }
};
blq: '{' sentlist '}';
type returns [String tipo]: 'void' {$tipo = "void";}| 'int' {$tipo = "int";}| 'float' {$tipo = "float";};
op returns [String operacion]: '+' {$operacion = "+";}| '-' {$operacion = "-";} | '*' {$operacion = "*";} | '/' {$operacion = "/";}| '%'{$operacion = "%";};
listparam returns [List<Param> params]: type IDENT
{
    $params = new ArrayList<>();
    $params.add(new Param($type.tipo, $IDENT.text));
} listparam2[$params];

listparam2[List<Param> params]: ',' type IDENT {params.add(new Param($type.tipo, $IDENT.text));} listparam2[params] | ;
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
restpart returns[ String name, List<Param> params, Blq block]: IDENT '(' restpart2 {$name=$IDENT.text;$params=$restpart2.params;$block=$restpart2.block;};
restpart2 returns [List<Param> params, Blq block]: listparam ')' {$params=$listparam.params;} blq {$block = $blq.block;}
| 'void' ')' blq {$params = null;$block = $blq.block;};

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