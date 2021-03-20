grammar EQL;
program: statement*;
statement: assignment | print ;
assignment: WORD ':' ( query | expression);
query:'{' (filter* | STAR* )'}';
print: 'print' '(' (query | WORD) ')' ;
expression:expression OPERAND expression
          |query
          |WORD;
filter:destination | time | subject | property | content | sorting | folder;
destination: to | from | cc;
time: 'time:'datevalue;
subject: 'subject:'subjectvalue;
property: forwarded | read;
content: body | attachments;
sorting: 'sortby:'sortingvalue;
folder: 'folder:'foldervalue;

to: 'to:'destinationvalue;
from: 'from:'destinationvalue;
cc: 'cc:'destinationvalue;

forwarded: 'forwarded:' BOOLVALUE;
read: 'read:' BOOLVALUE;

body: 'body:' bodyvalue;
attachments: 'attachements:' attachementsvalue;

datevalue: DATE | DATE STAR DATE | DATE STAR | STAR DATE | STAR DAY | DAY STAR | STAR YEAR | YEAR STAR;

subjectvalue: wordlist | STRING;

sortingvalue: PARAMETER SORTVALUE;

foldervalue: STRING;

destinationvalue: wordlist | EMAIL | STRING | WORD | STAR;

bodyvalue: wordlist | WORD | STRING;

attachementsvalue:  BOOLVALUE | FEXTENSION | WORD | INT | INTERVAL;
wordlist: WORD+;

YEAR: [1-9]+'y';
DAY: [1-9]'d';

SORTVALUE: 'ASC'|'DESC';
BOOLVALUE: 'YES'|'NO'|'yes'|'no';
PARAMETER: 'TIME'|'NAME';
FEXTENSION: '*.'SUBPART;
DATE:INT'-'INT'-'INT;
WORD: [a-zA-Z0-9]+;

EMAIL: SUBPART ('.' SUBPART)* '@' SUBPART ('.' SUBPART)*;
fragment SUBPART : [a-zA-Z0-9]+;

INTERVAL:[0-9]+'..'[0-9]+;
INT: [0-9]+;
OPERAND: '-' | '+';
ASSIGN: ':';
STRING: '"' .*? '"';
STAR: '*';
SPACE: [ \t\r\n]+ -> skip;
