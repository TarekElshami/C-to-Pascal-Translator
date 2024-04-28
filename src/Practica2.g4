grammar Practica2;

@parser::header{
import classes.Program;
import classes.Blq;
import classes.declarations.*;
import classes.expression.*;
import classes.sentences.*;
import classes.factors.*;
import classes.factors.conditionalfactors.*;
import classes.factors.normalfactors.*;

import java.util.ArrayList;
import java.util.List;
}
@parser::members {
 private Program program = new Program();
 private Blq currentBlq = new Blq();
 private String methName = null;
}

program : defines partes;
defines: '#define' IDENT ctes
{
    VarDcl constant = new VarDcl();
    constant.setName($IDENT.text);
    constant.setValue($ctes.constante);
    constant.setType(null);

    program.getBlock().addDcl(constant);
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
blq returns [Blq block]: {$block = new Blq();} '{' sentlist[$block] '}';
type returns [String tipo]: 'void' {$tipo = "void";}| 'int' {$tipo = "int";}| 'float' {$tipo = "float";};
op returns [String operacion]: '+' {$operacion = "+";}| '-' {$operacion = "-";} | '*' {$operacion = "*";} | '/' {$operacion = "/";}| '%'{$operacion = "%";};
listparam returns [List<Param> params]: type IDENT
{
    $params = new ArrayList<>();
    $params.add(new Param($type.tipo, $IDENT.text));
} listparam2[$params];

listparam2[List<Param> params]: ',' type IDENT {params.add(new Param($type.tipo, $IDENT.text));} listparam2[params] | ;
sentlist[Blq block] : sent {if ($sent.sentence!=null)block.addSent($sent.sentence); else block.addDcl($sent.dcl);} sentlist2[block];
sentlist2[Blq block]: sent {if ($sent.sentence!=null)block.addSent($sent.sentence); else block.addDcl($sent.dcl);} sentlist2[block]| ;
lid returns [String name]: IDENT lid2;
lid2: ',' IDENT lid2 | ;
lexp returns [List<Expression> params]: exp lexp2;
lexp2: ',' exp lexp2 | ;
exp returns [Expression expression]: factor exp2;
exp2: op exp exp2| ;
factor: '(' exp ')' | ctes | IDENT factor2;
factor2: '(' factor3 | ;
factor3: lexp ')' | ')';
restpart returns[ String name, List<Param> params, Blq block]: IDENT {methName = $IDENT.text;} '(' restpart2 {$name=$IDENT.text;$params=$restpart2.params;$block=$restpart2.block;methName=null;};
restpart2 returns [List<Param> params, Blq block]: listparam ')' {$params=$listparam.params;} blq {$block = $blq.block;}
    | 'void' ')' blq {$params = null;$block = $blq.block;};
sent returns [Sent sentence, Declaration dcl]: type lid ';' {$sentence = null; VarDcl varDcl = new VarDcl(); varDcl.setType($type.tipo);varDcl.setName($lid.name);varDcl.setValue(null);$dcl= varDcl;}
                                             | 'return' exp ';' {$dcl = null; Asig asig = new Asig(); asig.setName(methName); asig.setValue($exp.expression);}
                                             | IDENT sent2 {$dcl = null; SentWithName sent = $sent2.sentence; sent.setName($IDENT.text); $sentence = sent;}
                                             | 'if' '(' lcond ')' b1=blq 'else' b2=blq {$dcl = null; IfLoop ifLoop = new IfLoop(); ifLoop.setCond($lcond.condition); ifLoop.setBlockIf($b1.block); ifLoop.setBlockElse($b2.block);}
                                             | 'while' '(' lcond ')' blq      {$dcl = null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(true);  whileLoop.setCond($lcond.condition); whileLoop.setBlock($blq.block);}
                                             | 'do' blq 'until' '(' lcond ')' {$dcl = null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(false); whileLoop.setCond($lcond.condition); whileLoop.setBlock($blq.block);}
                                             | 'for' '(' id1=IDENT '=' e1=exp ';' lcond ';' id2=IDENT '=' e2=exp ')' blq {$dcl = null;}; // Estamos por aquí!!!
sent2 returns [SentWithName sentence]: '=' exp ';' {Asig asig = new Asig(); asig.setValue($exp.expression);}
                             | '(' sent3;
sent3 returns [List<Expression> params]: ')'';' {$params=null;}| lexp ')'';' {$params = $lexp.params;};
lcond returns [Cond condition]: cond lcond2 | '!' cond lcond2;
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