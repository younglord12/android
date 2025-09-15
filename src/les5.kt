fun mainr() {
    val str: String = "happy ovechkin neymar"
    val builder = StringBuilder()
    builder.append(str)
    println(builder.toString())
    val enough = str.split(" ").reversed().joinToString(" ")
    println(enough)
}