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
 private String methName = null;
}

program[String name] : {program.setName(name);} defines partes {System.out.println(program.getTranslation());};
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
        program.getBlock().getDclList().addAll(method.getBlock().getDclList());
        program.getBlock().setSentList(method.getBlock().getSentList());
    } else {
        program.getBlock().addDcl(method);
    }
};
blq returns [Blq block]: {$block = new Blq();} '{' sentlist[$block] '}';
type returns [String tipo]: 'void' {$tipo = "void";}| 'int' {$tipo = "INTEGER";}| 'float' {$tipo = "REAL";};
op returns [MathOp operacion]: '+' {$operacion = MathOp.SUM;}| '-' {$operacion = MathOp.SUB;} | '*' {$operacion = MathOp.MULT;} | '/' {$operacion = MathOp.DIV;}| '%'{$operacion = MathOp.MOD;};
listparam returns [List<Param> params]: type IDENT
{
    $params = new ArrayList<>();
    $params.add(new Param($IDENT.text, $type.tipo));
} listparam2[$params];

listparam2[List<Param> params]: ',' type IDENT {params.add(new Param($IDENT.text, $type.tipo));} listparam2[params] | ;
sentlist[Blq block] : sent {if ($sent.sentence!=null)block.addSent($sent.sentence); else block.addDcl($sent.dcl);} sentlist2[block];
sentlist2[Blq block]: sent {if ($sent.sentence!=null)block.addSent($sent.sentence); else block.addDcl($sent.dcl);} sentlist2[block]| ;
lid returns [String name]: IDENT {$name = $IDENT.text; List<String> names = new ArrayList<>();} lid2[names] {for (String s :names) {$name += ", " +s;}};
lid2[List<String> names]: ',' IDENT {names.add($IDENT.text);} lid2[names] | ;
lexp returns [List<Expression> params]: exp {$params = new ArrayList<>(); $params.add($exp.expression);} lexp2[$params] ;
lexp2[List<Expression> params]: ',' exp {params.add($exp.expression);} lexp2[params] | ;
exp returns [Expression expression]: {$expression = new Expression();} factor {$expression.addFactor($factor.fact);} exp2[$expression];
exp2[Expression expression]: op {expression.addOp($op.operacion);} exp {expression.getFactorList().addAll($exp.expression.getFactorList());expression.getOpList().addAll($exp.expression.getOpList());} exp2[expression]| ;
factor returns [Factor fact]: '(' exp ')' {Parenthesis par = new Parenthesis(); par.setValue($exp.expression); $fact=par;}
                            | ctes {Inmediate inm = new Inmediate($ctes.constante); $fact = inm;}
                            | IDENT {CallOrVar cov = new CallOrVar(); cov.setName($IDENT.text);} factor2 {if ($factor2.params==null) cov.setListParams(null); else cov.setListParams($factor2.params);$fact=cov;}
                            ;
factor2 returns [List<Expression> params]: '(' factor3 {$params = $factor3.params;}
        | {$params = null;};
factor3 returns [List<Expression> params]: lexp ')' {$params = $lexp.params;}| ')'{$params = new ArrayList<>();};
restpart returns[ String name, List<Param> params, Blq block]: IDENT {methName = $IDENT.text;} '(' restpart2 {$name=$IDENT.text;$params=$restpart2.params;$block=$restpart2.block;methName=null;};
restpart2 returns [List<Param> params, Blq block]: listparam ')' {$params=$listparam.params;} blq {$block = $blq.block;}
    | 'void' ')' blq {$params = null;$block = $blq.block;};
sent returns [Sent sentence, Declaration dcl]: type lid ';' {$sentence = null; VarDcl varDcl = new VarDcl(); varDcl.setType($type.tipo);varDcl.setName($lid.name);varDcl.setValue(null);$dcl= varDcl;}
                                             | 'return' exp ';' {$dcl = null; Asig asig = new Asig(); asig.setName(methName); asig.setValue($exp.expression); $sentence = asig;}
                                             | IDENT sent2 {$dcl = null; SentWithName sent = $sent2.sentence; sent.setName($IDENT.text); $sentence = sent;}
                                             | 'if' '(' lcond ')' b1=blq 'else' b2=blq {$dcl = null; IfLoop ifLoop = new IfLoop(); ifLoop.setCond($lcond.condition); ifLoop.setBlockIf($b1.block); ifLoop.setBlockElse($b2.block); $sentence = ifLoop;}
                                             | 'while' '(' lcond ')' blq      {$dcl = null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(true);  whileLoop.setCond($lcond.condition); whileLoop.setBlock($blq.block); $sentence = whileLoop;}
                                             | 'do' blq 'until' '(' lcond ')' {$dcl = null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(false); whileLoop.setCond($lcond.condition); whileLoop.setBlock($blq.block); $sentence = whileLoop;}
                                             | 'for' '(' id1=IDENT '=' e1=exp ';' lcond ';' id2=IDENT '=' e2=exp ')' blq
                                             {
                                                $dcl = null;
                                                ForManager forM = new ForManager();
                                                forM.setNameAsig($id1.text);
                                                forM.setExpAsig($e1.expression);
                                                forM.setCond($lcond.condition);
                                                forM.setNameIncrement($id2.text);
                                                forM.setExpIncrement($e2.expression);
                                                forM.setBlock($blq.block);

                                                $sentence = forM.get();
                                             }; // Estamos por aquí!!!
sent2 returns [SentWithName sentence]: '=' exp ';' {Asig asig = new Asig(); asig.setValue($exp.expression); $sentence = asig;}
                             | '(' sent3 {$sentence = new ProcCall();};
sent3 returns [List<Expression> params]: ')'';' {$params=null;}| lexp ')'';' {$params = $lexp.params;};

lcond returns [Cond condition]: cond {$condition=new Cond();$condition.addFactor($cond.fact);} lcond2[$condition]
            | '!' cond {Not not = new Not(); not.setFactorCond($cond.fact); $condition=new Cond();$condition.addFactor(not);} lcond2[$condition];
lcond2[Cond condition]: opl {condition.addOp($opl.andOr);} lcond {condition.addAll($lcond.condition);} lcond2[condition] | ; //call to lcond2 is probably unneccesary
opl returns [LogOp andOr]: '||' {$andOr = LogOp.OR;} | '&&' {$andOr = LogOp.AND;};
cond returns [FactorCond fact]: e1=exp opr e2=exp {Comp comp = new Comp(); comp.setP1($e1.expression);comp.setP2($e2.expression);comp.setOp($opr.operator); $fact = comp;};
opr returns [CompOp operator]: '==' {$operator = CompOp.EQUAL;}| '<' {$operator = CompOp.LESSER_THAN;}| '>' {$operator = CompOp.GREATER_THAN;}| '>=' {$operator = CompOp.GREATER_EQUAL;}| '<=' {$operator = CompOp.LESSER_EQUAL;};



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