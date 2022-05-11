# Grammar

body := ( `ifStatement` | `loop` | `expression` )

loop :=  ( `forLoop` | `whileLoop` | `doWhileLoop` )

forLoop := `FOR` `(` `typeMath`  `ID` `ASSIGN` `intVal` `SEMICOLON` (`comparison` | `boolVal`) `SEMICOLON` `expression` `)`

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
