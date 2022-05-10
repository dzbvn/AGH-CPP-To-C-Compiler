import warnings




def scanner(txt):
    
    openedBracket = False
    tokenList = []
    keyWords = ["int", "float", "double", "string", "void"]
    charIdx = -1
    while(charIdx < len(txt)-1):
        charIdx += 1
        #print(len(txt))
        print(txt[charIdx])
        if(txt[charIdx] in [' ', '\n']):
            continue
        if(txt[charIdx] == '\"' or txt[charIdx] == '\''):
            tmp = ""
            while(True):
                
                if charIdx < len(txt):
                    charIdx += 1
                    if txt[charIdx] == '\"' or txt[charIdx] == '\'':
                        tokenList.append(tmp)
                        break
                    else:
                        tmp += txt[charIdx]
                
            continue
        if(txt[charIdx] == '('):
            openedBracket = True       
        elif(txt[charIdx] == ')' and not openedBracket):
            warnings.warn("Closing bracket before opening one!")
            break
        elif(txt[charIdx].isdigit() or txt[charIdx] == '.'):
            tokenList.append(txt[charIdx])
            if(len(tokenList) >= 2 and (tokenList[-2].isdigit() or tokenList[-2][-1] == '.')):
                for idx in range(len(tokenList) - 2, -1, -1):
                    if tokenList[idx].isdigit() or tokenList[idx] == '.' or tokenList[idx][-1] == '.':
                        tokenList[idx] += txt[charIdx]
                        del tokenList[idx+1]
                    else:
                        break
        elif(txt[charIdx] in ['+','-','*','%','/']):
            tokenList.append(txt[charIdx])
        
        
    print(tokenList)
    return tokenList

def doMath(tokenList):
    result = 0.0
    operation = ''
    for token in tokenList:
        if operation == '' and (token.isdigit() or ('.' in token)):
            result = float(token)
        elif not token.isdigit():
            operation = token
        elif operation == '+' and (token.isdigit() or ('.' in token)):
            result += float(token)
        elif operation == '-' and (token.isdigit() or ('.' in token)):
            result -= float(token)
        elif operation == '*' and (token.isdigit() or ('.' in token)):
            result *= float(token)
        elif operation == '%' and (token.isdigit() or ('.' in token)):
            result %= float(token)
        elif operation == '/' and (token.isdigit() or ('.' in token)):
            result /= float(token)
    print(result)


def main():
    
    test = "\"test\" 21 + 36.7"
    l = ['(', '24',  '8']
    t = 11.
    #print(t + .5)
    #for txt[charIdx] in range(len(l) - 2, -1, -1):
    #    prfloat(txt[charIdx])
    #print(float("1.3"))
    scanner(test)


if __name__ == "__main__":
    main()