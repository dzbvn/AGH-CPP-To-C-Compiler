import os
import sys
from antlr4 import *
from numpy import extract
from CPP14Lexer import CPP14Lexer
from CPP14Parser import CPP14Parser
from CPP14ParserListener import CPP14ParserListener


if __name__ == "__main__":
    # Check for filepath argument
    if len(sys.argv) == 1:
        print("Usage: python . <filepath>")
        exit(1)

    # Prepare filepath and filename
    filepath = sys.argv[1]
    filename = filepath[filepath.rfind("/") + 1:]

    # Check if file exists
    if not os.path.isfile(filepath):
        print(f'File "{filepath}" does not exist')
        exit(1)

    # Run lexer and parser
    input_stream = FileStream(filepath)
    lexer = CPP14Lexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CPP14Parser(stream)
    tree = parser.translationUnit()
    listener = CPP14ParserListener()
    #parser.addParseListener(listener)
    walker = ParseTreeWalker()
    
    walker.walk(listener, tree)

    # Save output to file
    if not os.path.exists("output"):
        os.makedirs("output")
    f = open(f"output/{filename}.tree", "w")
    f.write(tree.toStringTree(recog=parser))
    f.close()
    print(f"Saved tree to output/{filename}.tree")