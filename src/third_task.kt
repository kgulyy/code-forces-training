fun main() {
    val words = readWords()
    println(words.joinToString("") { it.trim() })
}

fun readWords(separator: Char = ' ') = readLine()!!.split(separator)

fun String.trim(): String {
    val start = this.indexOfFirst { it.isLetter() } * 2
    val end = this.indexOfLast { it.isLetter() } * 2 + 1 - this.count()
    return this.slice(start..end)
}
