import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var radius : Double = readRadius()
    println(radius.pow(2) * PI)
}

fun readRadius() : Double = readLine()!!.toDouble()