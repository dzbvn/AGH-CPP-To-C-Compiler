from cmd import IDENTCHARS
from email import parser
import ply.lex as lex
from ply import yacc
# List of token names.   This is always required
tokens = [
    'ID',
    'NUMBER',
    'ADDITION',
    'SUBSTRACTION',
    'MULTIPLICATION',
    'DIVISION',
    'MODULUS',
    'INCREMENT',
    'DECREMENT',
    'EQUAL',
    'NOT_EQUAL',
    'GREATER',
    'LESS',
    'GREATER_OR_EQUAL',
    'LESS_OR_EQUAL',
    'AND',
    'OR',
    'NOT',
    'ASSIGN',
    'INCREMENTS_ASSIGN',
    'DECREMENTS_ASSIGN',
    'MULTIPLIES_ASSIGN',
    'DIVIDES_ASSIGN',
    'MODULUS_ASSIGN',
    'BRACKET_LEFT',
    'BRACKET_RIGHT',
    'PARENTHESE_LEFT',
    'PARENTHESE_RIGHT',
    'BRACE_LEFT',
    'BRACE_RIGHT',
    'COLON',
    'SEMICOLON',
    'PREPROCESSOR',
    'INT_VAL',
    'FLOAT_VAL',
    'LIBRARY',
    'COMMA',
    'OUTPUT'

]
reserved = {
    'auto':    'AUTO',
    'break':   'BREAK',
    'case':    'CASE',
    'char':    'CHAR',
    'const':   'CONST',
    'continue': 'CONTINUE',
    'do':      'DO',
    'double':  'DOUBLE',
    'default': 'DEFAULT',
    'else':    'ELSE',
    'float':   'FLOAT',
    'for':     'FOR',
    'goto':    'GOTO',
    'if':      'IF',
    'include': 'INCLUDE',
    'else':    'ELSE',
    'int':     'INT',
    'return':  'RETURN',
    'string':  'STRING',
    'struct':  'STRUCT',
    'switch':  'SWITCH',
    'void':    'VOID',
    'while':   'WHILE',
    'cout':    'COUT',
    'void':    'VOID'
}
tokens += reserved.values()

# Regular expression rules for simple tokens
t_ADDITION = r'\+'
t_SUBSTRACTION = r'-'
t_MULTIPLICATION = r'\*'
t_DIVISION = r'/'
t_MODULUS = r'\%'
t_INCREMENT = r'\+{2}'
t_DECREMENT = r'\-{2}'
t_EQUAL = r'\={2}'
t_NOT_EQUAL = r'\!='
t_GREATER = r'\>'
t_LESS = r'\<'
t_GREATER_OR_EQUAL = r'\>='
t_LESS_OR_EQUAL = r'\<='
t_AND = r'\&{2}'
t_OR = r'\|{2}'
t_NOT = r'\!'
t_ASSIGN = r'\='
t_INCREMENTS_ASSIGN = r'\+='
t_DECREMENTS_ASSIGN = r'\-='
t_MULTIPLIES_ASSIGN = r'\*='
t_DIVIDES_ASSIGN = r'\/='
t_MODULUS_ASSIGN = r'\%='
t_BRACKET_LEFT = r'\['
t_BRACKET_RIGHT = r'\]'
t_PARENTHESE_LEFT = r'\('
t_PARENTHESE_RIGHT = r'\)'
t_BRACE_LEFT = r'\{'
t_BRACE_RIGHT = r'\}'
t_COLON = r'\:'
t_SEMICOLON = r'\;'
t_PREPROCESSOR = r'\#'
t_LIBRARY = r'\<.*\>'
t_COMMA = r'\,'
t_OUTPUT = r'\<{2}'


# A regular expression rule with some action code
def t_INT_VAL(t):
    r'\d+'
    t.value = int(t.value)
    return t


def t_FLOAT_VAL(t):
    r'\d+\.\d+'
    t.value = float(t.value)
    return t


def t_ID(t):
    r'[a-zA-Z_][a-zA-Z0-9_]*'
    if t.value in reserved:
        t.type = reserved[t.value]
    else:
        t.type = 'ID'
    return t

# Define a rule so we can track line numbers


def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)


# A string containing ignored characters (spaces and tabs)
t_ignore = ' \t'

# Error handling rule


def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)
    


lexer = lex.lex()

##############################| TEST GRAMMAR |##############################


#############################| GRAMMAR |###########################

def p_start(p):
    '''
    start : program
    '''
    p[0] = p[1]
    print(p[1])


def p_program(p):
    '''
    program : elements
    '''
    p[0] = p[1]



def p_header(p):
    '''
    header : PREPROCESSOR INCLUDE LIBRARY
    '''
    p[0] = (p[1], p[2], p[3])

def p_elements(p):
    '''
    elements : element
             | element elements
    '''
    if len(p) == 2:
        p[0] = p[1]
    else:
        p[0] = p[1] + p[2]


def p_element(p):
    '''
    element : function_definition
            | void_function_definition
            | header
            | empty
    '''
    p[0] = p[1]


def p_function_definition(p):
    '''
    function_definition : type ID PARENTHESE_LEFT function_parameters PARENTHESE_RIGHT BRACE_LEFT expressions return_statement BRACE_RIGHT
    '''
    p[0] = (p[1], p[2], p[3], p[4],  p[5], p[6], p[7], p[8], p[9])

def p_void_function_definition(p):
    '''
    void_function_definition : VOID ID PARENTHESE_LEFT function_parameters PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
    '''
    p[0] = (p[1], p[2], p[3], p[4],  p[5], p[6], p[7], p[8])

def p_function_parameters(p):
    '''
    function_parameters : type ID
                        | type ID COMMA function_parameters
                        | empty
    '''
    if len(p) == 2:
        p[0] = p[1]
    elif len(p) == 4:
        p[0] = (p[1], p[2], p[3])


def p_expressions(p):
    '''
    expressions : expression
        | expression expressions
        | empty
    '''
    if len(p) == 2:
        p[0] = p[1]

    elif len(p) == 3:
        p[0] = p[1] + p[2]


def p_expression(p):
    '''
    expression : conditional_expression
            | iteration_expression
            | print_expression
            | assignment_expression
            | empty
    '''
    p[0] = p[1]

def p_assignment_expression(p):
    '''
    assignment_expression : ID assignment_operator val SEMICOLON
                          | ID assignment_operator ID SEMICOLON
           
    '''
    p[0] = (p[1], p[2], p[3], p[4])

def p_assignment_operator(p):
    '''
    assignment_operator : ASSIGN
        | INCREMENTS_ASSIGN
        | DECREMENTS_ASSIGN
        | MULTIPLIES_ASSIGN
        | DIVIDES_ASSIGN
        | MODULUS_ASSIGN
    '''
    p[0] = p[1]


def p_print_expression(p):
    '''
    print_expression : COUT OUTPUT val SEMICOLON
           
    '''
    p[0] = (p[1], p[2], p[3], p[4])


def p_iteration_expression(p):
    '''
    iteration_expression : while_iteration
            | do_while_iteration
           
    '''
    p[0] = p[1]

def p_while_iteration(p):
    '''
    while_iteration : WHILE PARENTHESE_LEFT condition PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
    '''
    p[0] = (p[1], p[2], p[3], p[4],  p[5], p[6], p[7])

def p_do_while_iteration(p):
    '''
    do_while_iteration : DO BRACE_LEFT expressions BRACE_RIGHT WHILE PARENTHESE_LEFT condition PARENTHESE_RIGHT SEMICOLON
    '''
    p[0] = (p[1], p[2], p[3], p[4],  p[5], p[6], p[7], p[8], p[9])



def p_conditional_expression(p):
    '''
    conditional_expression : IF PARENTHESE_LEFT condition PARENTHESE_RIGHT BRACE_LEFT expressions BRACE_RIGHT
    '''
    p[0] = (p[1], p[2], p[3], p[4],  p[5], p[6], p[7])

def p_condition(p):
    '''
    condition : NOT ID
        | condition logical_operator condition
        | val comparison_operator val
        | val
    '''
    if len(p) == 2:
        p[0] = p[1]
    elif len(p) == 3:
        p[0] = (p[1], p[2])
    elif len(p) == 4:
        p[0] = (p[1], p[2] , p[3])

def p_comparison_operator(p):
    '''
    comparison_operator : GREATER
        | LESS
        | GREATER_OR_EQUAL
        | LESS_OR_EQUAL
        | NOT_EQUAL
        | EQUAL
    '''
    p[0] = p[1]

def p_logical_operator(p):
    '''
    logical_operator : AND
        | OR
    '''
    p[0] = p[1]


def p_return_statement(p):
    '''
    return_statement : RETURN val SEMICOLON
    '''
    p[0] = (p[1], p[2], p[3])


def p_val(p):
    '''
    val : FLOAT_VAL
        | INT_VAL
        | ID
    '''
    p[0] = p[1]


def p_type(p):
    '''
    type : INT
            | FLOAT
            | STRING
            | CHAR
            | DOUBLE
            | VOID
    '''
    p[0] = p[1]



def p_empty(p):
    '''
    empty : 
    '''
    p[0] = ""

def p_error(p):
    print("Syntax error at:", p.type, p.value, "coords:", p.lineno, p.lexpos)


data = '''
#include <iostream>
#include <ctime>

void test(){
    if(4 < 2){
        cout << var;
    }
    
}

int main(){
    
    if(3 > 2){
        if(var > 1){
            while(var > 2){
                cout << var;
            }
            varT *= 2;
        }
    }
    return 2;
}
'''
parser = yacc.yacc()
parser.parse(data)
