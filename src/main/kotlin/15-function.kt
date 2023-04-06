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

infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun factorial(value: Int): Int {
    return if (value == 1) {
        1
    } else {
        value * factorial(value - 1)
    }
}

tailrec fun factorialTailrec(value: Int, total: Int = 1): Int {
    return if (value == 1) {
        total
    } else {
        factorialTailrec(value - 1, total * value)
    }
}

fun helloTransformer(name: String, callback: (String) -> String): String {
    return callback(name)
}

inline fun helloTransformerInline(name: String, callback: (String) -> String): String {
    return callback(name)
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

    // infix function notation
    val name2 = "Halim" to "UP"
    println(name2)

    // recursive function
    val result4 = factorial(5)
    println(result4)

    // tailrec function
    val result5 = factorialTailrec(5)
    println(result5)

    // lambda function
    val generateFullname: (String, String) -> String = { firstname: String, lastname: String ->
        "$firstname $lastname"
    }
    val result6 = generateFullname("Muhammad", "Rahmahalim")
    println(result6)


    // method reference
    val addNumber: (Int, Int) -> Int = ::add
    val result7 = addNumber(1, 2)
    println(result7)

    // higher order function
    val result8 = helloTransformer("Halim", { value: String -> value.uppercase() })
    println(result8)

    // higher order function - trailing lambda
    val result9 = helloTransformer("Oxwazz") { value: String -> value.uppercase() }
    println(result9)

    // anonymous function
    val upperText = fun(value: String): String {
        return value.uppercase()
    }
    println(upperText("Mantab"))

    // inline function (fix performance issues when passing lambda function in parameter)
    val result10 = helloTransformerInline("hehe") { value: String -> value.uppercase() }
    println(result10)
}