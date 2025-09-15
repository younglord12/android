fun main() {
    val str: String = "happy ov cucumber"
    val builder = StringBuilder()
    builder.append(str)
    println(builder.toString())
    val enough = str.split(" ").reversed().joinToString(" ")
    println(enough)
}