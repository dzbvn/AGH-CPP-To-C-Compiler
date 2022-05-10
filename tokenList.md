# Token list

## Keywords

``` 
auto         double      int        struct
break        else        long       switch
case         enum        register   typedef
char         extern      return     union
const        float       short      unsigned
continue     for         signed     void
default      goto        sizeof     volatile
do           if          static     while
```
```
try          catch       throw
bool         true        false
private      protected   public
class        friend      new
```

## Identifiers

Contains:
```
_ a b c d e f g h i j k l m
n o p q r s t u v w x y z
A B C D E F G H I J K L M
N O P Q R S T U V W X Y Z
```
Not at first place:
```
0 1 2 3 4 5 6 7 8 9
```

## Constants

Value of constants never changes during execution once defined

- `const` keyword
- `#define` preprocessor

## Strings and character literals

Array of characters ended with a null character. Defined by `" "` or by char array. 

### Escape sequences
- `\n` Newline
- `\t` Horizontal tab
- `\\` Backslash
- `?` or `\?` Question mark
- `\v` Vertical tab
- `\'` Single quote
- `\"` Double quote
- `\b` Backspace
- `\r` Carriage return
- `\0` The null character
- `\f` Form feed
- `\ooo` Octal
- `\a` Alert (bell)
- `\xhhh` Hexadecimal

> prefixes e.g. 


## Numeric, boolean, and pointer literals
- type `int` -> only digits
- type `float` -> contain decimal point `.`
- type `bool` -> `true` or `false`

## Special symbols / Punctuators

- `[]` Brackets
- `()` Parentheses
- `{}` Braces
- `:` Colon
- `;` Semicolon
- `#` Pre-processor

## Operators

### Arithmetic Operators
- `+` Addition 
- `-` Subtraction 
- `*` Multiplication
- `\` Division
- `%` Modulus

### Increment and Decrement Operators
- `++` Increment
- `--` Decrement 

### Relational Operators
- `==` Is equal to
- `!=` Is not equal to 
- `>` Greater than
- `<` Less than
- `>=` Greater than or equal
- `<=` Less than or equal

### Logical Operators
- `&&` And operator
- `||` Or operator
- `!` Not operator

### Bitwise Operators
- `&` Bitwise and 
- `|` Bitwise or 
- `^` Bitwise xor 
- `<<` Left shift 
- `>>` Right shift
- `~` Bitwise not

### Assignment Operators
- `=` Assign
- `+=` Increments, then assign
- `-=` Decrements, then assign
- `*=` Multiplies, then assign
- `/=` Divides, then assign
- `%=` Modulus, then assigns    
- `<<=` Left shift and assigns
- `>>=` Right shift and assigns
- `&=` Bitwise AND assigns 
- `^=` Bitwise exclusive OR and assigns
- `|=` Bitwise inclusive OR and assigns

### Misc Operators
- `,` Comma operator
- `sizeOf()` Returns the size of a memory location.  
- `&` Returns the address of a memory location.
- `*` Pointer to a variable.
- `?:` Conditional Expression