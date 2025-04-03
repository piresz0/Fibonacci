fun main() {
    print("Digite um número acima de 1: ")
    var num = readln().toIntOrNull() ?: return
    var fib = 0

    repeat(num) {
        print("$fib ")
        fib = (fib + (fib - 1)).takeIf { it > 0 } ?: 1
    }
}
