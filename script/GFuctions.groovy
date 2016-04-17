def functionA(argA) {
    println argA
}

int functionB(int argB) {
    println argB
    return argB
}

String fuctionC() {
    "Hello World"
}

String a = '123';
int b = 10

functionA(functionB(b))
//functionB(b)
println fuctionC()

