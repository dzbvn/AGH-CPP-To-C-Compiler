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
    'FLOAT_VAL'

]
reserved = {
    'auto':    'AUTO',
    'break':   'BREAK',
    'case':    'CASE',
    'char':    'CHAR',
    'const':   'CONST',
    'continue':'CONTINUE',
    'do':      'DO',
    'double':  'DOUBLE',
    'default': 'DEFAULT',
    'else':    'ELSE',
    'float':   'FLOAT',
    'for':     'FOR',
    'goto':    'GOTO',
    'if':      'IF',
    'else':    'ELSE',
    'int':     'INT',
    'return':  'RETURN',
    'struct':  'STRUCT',
    'switch':  'SWITCH',
    'void':    'VOID',
    'while':   'WHILE'
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

def p_calc(p):
    '''
    calc : expression
         | empty
    '''
    print(p[1])

def p_expression(p):
    '''
    expression : expression MULTIPLICATION expression
               | expression DIVISION expression
               | expression ADDITION expression
               | expression SUBSTRACTION expression
    '''
    p[0] = (p[2], p[1], p[3])

def p_expression_int_float(p):
    '''
    expression : INT_VAL
               | FLOAT_VAL
    '''
    p[0] = p[1]

def p_empty(p):
    '''
    empty :     
    '''
    p[0] = None

#############################| GRAMMAR |###########################



data = '''
3 + 2 * 5
'''
parser = yacc.yacc()
parser.parse(data)