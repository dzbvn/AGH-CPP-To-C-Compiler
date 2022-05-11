# Grammar

body := `ifStatement` | `loop` | `expression` 

loop :=  `forLoop` | `whileLoop` | `doWhileLoop` 

comparator := `EQUAL` | `NOT_EQUAL` | `GREATER` | `GREATER_OR_EQUAL` | `LESS` | `LESS_OR_EQUAL` 

comparison := `val` `comparator` `val`

forLoop := `FOR` `(` `typeMath`  `ID` `ASSIGN` `intVal` `SEMICOLON` (`comparison` | `boolVal`) `SEMICOLON` `expression` `)` `{` `body` `}` 


typeMath := `int` | `double` | `float` 
## For loop

forloop := \
`for` `(` type name `=` )

## If
ifstatement := \
`if` (expression) `{` body `}`\
[ `else` `{` body `}` ]

expression := mathematical formula

## Function 
head := type name `(` [params] `)` \
params := param { , param } \
param := type name \
type := `int` 
        | `double` 
        | `char` 
        | `string` 
        | name

## If
