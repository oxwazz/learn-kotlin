fun hello(): Unit {
    println("Hello")
}

fun greet(name: String): Unit {
    println("Hello $name")
}

fun biodata(name: String, age: Int = 0): Unit {
    println("Name: $name")
    println("Age: $age")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun addShorter(a: Int, b: Int): Int = a + b

fun sum(name: String, vararg numbers: Int): String {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return "total $name: $sum"
}

fun String.hello(): Unit {
    println("Hello $this")
}

fun main() {
    // simple function
    hello()

    // parameter
    greet("Halim")

    // multiple parameter
    biodata("Halim", 17)

    // default parameter
    biodata("Budi")

    // named parameter
    biodata(age = 22, name = "Eko")

    // return value
    val result = add(1, 2)
    println(result)

    // return value (shorter)
    val result2 = addShorter(1, 2)
    println(result2)

    // varargs parameter
    val result3 = sum("meja", 1, 2, 3, 4, 5)
    println(result3)

    // extension function
    val name = "Halim"
    name.hello()
}