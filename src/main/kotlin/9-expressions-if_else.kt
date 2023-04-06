fun main() {
    val age: Int = 17;
    if (age > 17) {
        println("adult")
    } else if (age == 17) {
        println("sweet 17")
    } else {
        println("child")
    }

    val onelineIfElse = if (age >= 17) "adult" else "child";
    println(onelineIfElse)

    val inlineIfElse = if (age >= 17) {
        "adult"
    } else {
        "child"
    }
    println(inlineIfElse)
}