import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val radius = readRadius()
    println(radius.pow(2) * PI)
}

fun readRadius() = readLine()!!.toDouble()