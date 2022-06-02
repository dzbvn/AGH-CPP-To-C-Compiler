Rule 0     S' -> start
Rule 1     start -> program
Rule 2     program -> elements
Rule 3     header -> PREPROCESSOR INCLUDE LIBRARY
Rule 4     elements -> element
Rule 5     elements -> element elements
Rule 6     element -> function_definition
Rule 7     element -> void_function_definition
Rule 8     element -> header
Rule 9     element -> empty
Rule 10    function_definition -> type ID PARENTHESE_LEFT function_parameters PARENTHESE_RIGHT BRACE_LEFT expressions return_statement BRACE_RIGHT
Rule 11    void_function_definition -> VOID ID PARENTHESE_LEFT function_parameters PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
Rule 12    function_parameters -> type ID
Rule 13    function_parameters -> type ID COMMA function_parameters
Rule 14    function_parameters -> empty
Rule 15    expressions -> expression
Rule 16    expressions -> expression expressions
Rule 17    expressions -> empty
Rule 18    expression -> conditional_expression
Rule 19    expression -> iteration_expression
Rule 20    expression -> print_expression
Rule 21    expression -> assignment_expression
Rule 22    expression -> empty
Rule 23    assignment_expression -> ID assignment_operator val SEMICOLON
Rule 24    assignment_expression -> ID assignment_operator ID SEMICOLON
Rule 25    assignment_operator -> ASSIGN
Rule 26    assignment_operator -> INCREMENTS_ASSIGN
Rule 27    assignment_operator -> DECREMENTS_ASSIGN
Rule 28    assignment_operator -> MULTIPLIES_ASSIGN
Rule 29    assignment_operator -> DIVIDES_ASSIGN
Rule 30    assignment_operator -> MODULUS_ASSIGN
Rule 31    print_expression -> COUT OUTPUT val SEMICOLON
Rule 32    iteration_expression -> while_iteration
Rule 33    iteration_expression -> do_while_iteration
Rule 34    while_iteration -> WHILE PARENTHESE_LEFT condition PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
Rule 35    do_while_iteration -> DO BRACE_LEFT expressions BRACE_RIGHT WHILE PARENTHESE_LEFT condition PARENTHESE_RIGHT SEMICOLON
Rule 36    conditional_expression -> IF PARENTHESE_LEFT condition PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
Rule 37    condition -> NOT ID
Rule 38    condition -> condition logical_operator condition
Rule 39    condition -> val comparison_operator val
Rule 40    condition -> val
Rule 41    comparison_operator -> GREATER
Rule 42    comparison_operator -> LESS
Rule 43    comparison_operator -> GREATER_OR_EQUAL
Rule 44    comparison_operator -> LESS_OR_EQUAL
Rule 45    comparison_operator -> NOT_EQUAL
Rule 46    comparison_operator -> EQUAL
Rule 47    logical_operator -> AND
Rule 48    logical_operator -> OR
Rule 49    return_statement -> RETURN val SEMICOLON
Rule 50    val -> FLOAT_VAL
Rule 51    val -> INT_VAL
Rule 52    val -> ID
Rule 53    type -> INT
Rule 54    type -> FLOAT
Rule 55    type -> STRING
Rule 56    type -> CHAR
Rule 57    type -> DOUBLE
Rule 58    type -> VOID
Rule 59    empty -> <empty>
