grammar Python;
prule: function;
function:  seq | branch | branchRe | concur | concurRe | cond | para | loop | choice | seqSeq | repeat ;
seq: 'Seq' '(' arg_python ',' arg_python ')';
branch: 'Branch' '(' arg_python ',' arg_python ',' arg_python ')';
branchRe: 'BranchRe' '(' arg_python ',' arg_python ',' arg_python ')';
concur: 'Concur' '(' arg_python ',' arg_python ',' arg_python ')';
concurRe: 'ConcurRe' '(' arg_python ',' arg_python ',' arg_python ')';
cond: 'Cond' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
para: 'Para' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
loop: 'Loop' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
choice: 'Choice' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
seqSeq: 'SeqSeq' '(' arg_python ',' arg_python ',' arg_python ')';
repeat: 'Repeat' '(' arg_python ',' arg_python ',' arg_python ',' arg_python ')';
type:'def ';
arg_python: type ID|prule;
ID:[a-zA-Z_]+ [a-zA-Z0-9_]*;
