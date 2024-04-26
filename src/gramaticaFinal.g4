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
                  | 'if' expcond 'then' blq 'else' blq
                  | 'while' expcond 'do' blq
                  | 'repeat' blq 'until' expcond ';'
                  | 'for' IDENTIFIER ':=' exp inc exp 'do' blq;
inc : 'to' | 'downto';
asig : id ':=' exp;
id : IDENTIFIER;
exp : exp op exp | factor;
op : oparit;
oparit : '+' | '-' | '*' | 'div' | 'mod';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist :'(' explist ')' |;
explist : exp | exp ',' explist;
proc_call : IDENTIFIER subpparamlist;

expcond : expcond oplog expcond | factorcond;
oplog : 'or' | 'and';
factorcond : exp opcomp exp | '(' exp ')' | 'not' factorcond;
opcomp : '<' | '>' | '<=' | '>=' | '=';