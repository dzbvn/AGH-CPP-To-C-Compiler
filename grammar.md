# Grammar

type := `INT` | `DOUBLE` | `FLOAT` | `CHAR` | `STRING`

body := `ifStatement` | `loop` | `expression`  

loop :=  `forLoop` | `whileLoop` | `doWhileLoop` 

comparator := `EQUAL` | `NOT_EQUAL` | `GREATER` | `GREATER_OR_EQUAL` | `LESS` | `LESS_OR_EQUAL` 

comparison := `val` `comparator` `val`

operatorMath := `ADDITION` | `SUBSTRACTION` | `DIVISION` | `MODULUS` | `MULTIPLICATION` 

assignOperatorMath := `INCREMENTS_ASSIGN` | `DECREMENTS_ASSIGN` | `MULTIPLIES_ASSIGN` | `DIVIDES_ASSIGN` | `MODULUS_ASSIGN`

expression := `val` ( `operatorMath` | `assignOperatorMath` ) `val` `SEMICOLON`

forLoop := `FOR` `(` `typeMath`  `ID` `ASSIGN` `valMath` `SEMICOLON` `ID` `comparator` `valMath` `SEMICOLON` `expression` `)` `{` `body` `}` 

typeMath := `INT` | `DOUBLE` | `FLOAT` 

valMath := `intVal` | `floatVal` | `doubleVal`

whileLoop := `WHILE` `(` `comparison` `)` `{` `body` `}` 

doWhileLoop := `DO` `{` `body` `}` `WHILE` `(` `comparison` `)` `SEMICOLON`

ifStatement := `IF` `(` `comparison` [ ( `AND` | `OR` ) `comparison`]) `{` `body` `}` [ `ELSE` `{` `body` `}` ]

switchStatement := `SWITCH` `(` `expression` `)` `{` `cases` [`DEFAULT` `COLON`] `}` 

cases := `CASE` `val` `COLON` `body` `BREAK` `SEMICOLON` [`CASE` `val` `COLON` `body` `BREAK` `SEMICOLON`]*

include := `PREPROCESSOR` `INCLUDE` `header`

header := `LOCAL_HEADER` | `STANDARD_LIBRARY`

function := `headF` `{` `bodyF` `}`

headF := `type` `ID` `(` [params] `)`

params := param [, param]*

bodyF := `body` `returnStatement`

returnStatement := `RETURN` ( `ID` | `expression` | `val` )

val := `INT_VAL` | `CHAR_VAL` | `FLOAT_VAL` |  `STRING_VAL` | `DOUBLE_VAL`


