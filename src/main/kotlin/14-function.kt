fun hello() {
    println("Hello")
}

fun greet(name: String) {
    println("Hello $name")
}

fun biodata(name: String, age: Int = 0) {
    println("Name: $name")
    println("Age: $age")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun addShorter(a: Int, b: Int): Int = a + b


fun main() {
    // simple function
    hello()

    // function with parameter
    greet("Halim")

    // function with multiple parameter
    biodata("Halim", 17)

    // function with default parameter
    biodata("Budi")

    // function with named parameter
    biodata(age = 22, name = "Eko")

    // function with return value
    val result = add(1, 2)
    println(result)

    // function with return value (shorter)
    val result2 = addShorter(1, 2)
    println(result2)
}