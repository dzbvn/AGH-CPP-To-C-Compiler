#include <cstdio>

int add(int a, int b){
    return a + b;
}

int main(){
    int a = 3;
    int b = 4;
    int result = add(a, b);
    printf("%d", result);
}