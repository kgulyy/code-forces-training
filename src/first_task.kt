import java.math.BigInteger

fun main() {
    val numbers = readNumbers()
    println(numbers.sum())
}

fun readNumbers(separator: Char = ' ') = readLine()!!.split(separator)

fun List<String>.sum() = this.fold(BigInteger.ZERO) {sum, number -> sum + number.toBigInteger()}