import java.math.BigInteger

fun main() {
    var array : List<String> = readNumbers()
    println(array.sum())
}

fun readNumbers(separator: Char = ' ') = readLine()!!.split(separator)

fun Iterable<String>.sum(): BigInteger {
    var sum: BigInteger = BigInteger.ZERO
    for (element in this) {
        sum = sum.plus(element.toBigInteger())
    }
    return sum
}