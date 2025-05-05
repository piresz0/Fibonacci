fun main() {
    print("Digite um número acima de 1: ")
    val n = readln().toIntOrNull() ?: return

    var fib: Pair<Int, Int> = 0 to 1

    repeat(n) {
        print("${fib.first} ")
        fib = fib.second to (fib.first + fib.second)
    }
}
