import java.math.BigInteger

fun main() {
    var array : List<BigInteger> = readInts()
    println(array.sum())
}

fun readInts(separator: Char = ' ') = readLine()!!.split(separator).map(String::toBigInteger)

fun Iterable<BigInteger>.sum(): BigInteger {
    var sum: BigInteger = BigInteger.ZERO
    for (element in this) {
        sum += element
    }
    return sum
}