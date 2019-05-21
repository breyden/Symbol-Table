#functional hash-table implementation of a Symbol Table to handle simple constant definitions and uses in a statically-scoped block structured language.

Use a stack to maintain copies of hash table arrays for outer scopes. Use a hash table array size of 5, with chaining for collision resolution. Use any reasonable hashing algorithm.

Your main program (named main) must accept a single command-line parameter that is the name of a data file containing actions to be performed on the symbol table. The following is a sample of the data file contents:

beginscope
define a 1
use a
endscope
use a
Your program must scan through the data file in sequence and perform the necessary operations on the symbol table.

Your output must be identical to the input, except that each “use” line must have the value of the constant indicated. For example, the above input file will result in the following output, printed to stdout:

beginscope
define a 1
use a = 1
endscope
use a = undefined
