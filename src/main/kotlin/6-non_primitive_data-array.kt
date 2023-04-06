fun main() {
    // data types
    val names: Array<String> = arrayOf("Muhammad", "Rahmahalim", "Oxwazz");
    val maybeCars: Array<String?> = arrayOfNulls(3);

    // get data array
    val getName1 = names[0]
    val getName2 = names.get(0)

    // set data array
    names[1] = "ZZZZ"
    names.set(2, "AAAA")
}