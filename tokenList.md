| Keyword | Token |
| ------------- |:-------------:|
|    auto   | `AUTO`      |
| break     | `BREAK`     |
| case      | `CASE`      |
| char      | `CHAR`      |
| const     | `CONST`     |
| continue  | `CONTINUE`  |
| do        | `DO`        |
| double    | `DOUBLE`    |
| default   | `DEFAULT`   |
| else      | `ELSE`      |
| float     | `FLOAT`     |
| for       | `FOR`       |
| goto      | `GOTO`      |
| if        | `IF`        |
| else      | `ELSE`      |
| int       | `INT`       |
| return    | `RETURN`    |
| struct    | `STRUCT`    |
| switch    | `SWITCH`    |
| void      | `VOID`      |
| while     | `WHILE`     |
| +         | `ADDITION`       |  
| -         | `SUBSTRACTION`   |
| \         | `DIVISION`       |
| %         | `MODULUS`        | 
| *         | `MULTIPLICATION` |
| ++ |`INCREMENT`|
| -- |`DECREMENT `|
| ==| `EQUAL`|
| != |`NOT_EQUAL`|
| > |`GREATER`|
| < |`LESS`|
| >=| `GREATER_OR_EQUAL`|
| <=| `LESS_OR_EQUAL`|
| && | `AND`|
| || | `OR`|
| ! | `NOT`|
| = | `ASSIGN` |
| += | `INCREMENTS_ASSIGN` |
| -= | `DECREMENTS_ASSIGN` |
| *=  | `MULTIPLIES_ASSIGN` |
| /= | `DIVIDES_ASSIGN` |
| %= | `MODULUS_ASSIGN` |
| [ | `BRACKET_LEFT` |
| ] | `BRACKET_RIGHT` |
| ( | `PARENTHESE_LEFT` |
| ) | `PARENTHESE_RIGHT` |
| { | `BRACE_LEFT` |
| } | `BRACE_RIGHT` |
| : | `COLON` |
| ; | `SEMICOLON` |
| # | `PREPROCESSOR` |
| [a-zA-Z_][a-zA-Z_0-9]* | `ID` |
| [.][h]$ | `LOCAL_HEADER` |
| ^[<].*[>]$  | `STANDARD_LIBRARY` |
| ^\d+$ | `INT_VAL` |