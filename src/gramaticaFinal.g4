grammar gramaticaFinal;

prg : 'program' IDENTIFIER ';' blq '.';
blq : dcllist 'begin' sentlist 'end';
dcllist : dcllist dcl |;

sentlist : sent | sentlist sent;
dcl : defcte | defvar | defproc | deffun;
defcte : 'const' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';'| ctelist IDENTIFIER '=' simpvalue ';';
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST| STRING_CONST;
defvar : 'var' defvarlist ';';
defvarlist : varlist ':' tbas | defvarlist ';' varlist ':' tbas;
varlist : IDENTIFIER | IDENTIFIER ',' varlist;
defproc : 'procedure' IDENTIFIER formal_paramlist ';' blq ';';

deffun : 'function' IDENTIFIER formal_paramlist ':' tbas ';' blq';';
formal_paramlist : '(' formal_param ')' |;
formal_param : varlist ':' tbas | varlist ':' tbas ';' formal_param;
tbas : 'INTEGER' | 'REAL';

sent : asig ';' | proc_call ';'
                  | 'if' '(' lcond ')' blq 'else' blq
                  | 'while' '(' lcond ')' blq
                  | 'do' blq 'until' '(' lcond ')'
                  | 'for' '(' IDENT '=' exp ';' lcond ';' IDENT '=' exp ')' bl;
asig : id ':=' exp;
id : IDENTIFIER;
exp : exp op exp | factor;
op : oparit;
oparit : '+' | '-' | '*' | 'div' | 'mod';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist :'(' explist ')' |;
explist : exp | exp ',' explist;
proc_call : IDENTIFIER subpparamlist;

lcond : lcond opl lcond | cond | '!' cond;
opl : '||' | '&&';
cond : exp opr exp;
opr : '==' | '<' | '>' | '>=' | '<=';