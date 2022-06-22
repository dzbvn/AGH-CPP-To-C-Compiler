import os
import sys
from antlr4 import *
from numpy import extract
from CPP14Lexer import CPP14Lexer
from CPP14Parser import CPP14Parser
from CPP14Listener import CPP14Listener
from CPP14Visitor import CPP14Visitor
import PySimpleGUI as sg


def Compiler(input_stream, file_name):
    lexer = CPP14Lexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CPP14Parser(stream)
    tree = parser.translationUnit()

    #listener = CPP14Listener()
    #parser.addParseListener(listener)
    #walker = ParseTreeWalker()
    #walker.walk(listener, tree)

    visitor = CPP14Visitor()
    output = visitor.visit(tree)
    print(output)
    if not os.path.exists("output"):
        os.makedirs("output")

    c_file = open(f"output/{file_name}.c", "w")
    c_file.write(output)
    c_file.close()

    os.system(f'.\\utils\\AStyle.exe .\\output\\{file_name}.c')
    os.system(f'del .\\output\\{file_name}.c.orig')
    tree_file = open(f"output/{file_name}.tree", "w")
    tree_file.write(tree.toStringTree(recog=parser))
    tree_file.close()


def Gui():
    sg.theme('DarkBlue')   # Add a touch of color
    # All the stuff inside your window.
    col1 = [[sg.Text('Input C++ Code Here')],
            [sg.Multiline(key="texto", size=(50, 20))],
            [sg.Button('Ok'), sg.Button('Cancel')]]

    col2 = [[sg.Text('Output in C')],
            [sg.Text('Some text on Row 1', size=(50, 20), key='output')],
            [sg.Text('Some text on Row 1')]
            ]

    layout = [[sg.Column(col1, element_justification='c'),
               sg.Column(col2, element_justification='c')]]

    # Create the Window
    window = sg.Window('C++ To C Compiler', layout)
    # Event Loop to process "events" and get the "values" of the inputs
    while True:
        event, values = window.read()
        
        if event == 'Ok':
            #print(values["texto"])
            temp_file = open(f"inputData.cpp", "w")
            temp_file.write(values["texto"])
            temp_file.close()

            input_stream = FileStream("inputData.cpp")
            
            Compiler(input_stream, "inputData")

            with open("./output/inputData.c", "r") as f:
                data = f.read()
          
            window['output'].update(data)

        elif event == sg.WIN_CLOSED or event == 'Cancel':  # if user closes window or clicks cancel
            break
        #print('You entered ', values[0])

    window.close()


if __name__ == "__main__":

    #Gui()
    if len(sys.argv) == 2:
        filepath = sys.argv[1]
        filename = filepath[filepath.rfind("/") + 1:]
        file_name = os.path.basename(filename)
        file_name = os.path.splitext(file_name)[0]

        input_stream = FileStream(filepath)

        Compiler(input_stream, file_name)

    else:
        Gui()
    


    
