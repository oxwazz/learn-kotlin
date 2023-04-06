fun main() {
    // break with label
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 3 && j == 3) {
                break@loop
            }
            println("$i - $j")
        }
    }


    // continue with label
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i == 3 && j == 3) {
                continue@loop
            }
            println("$i - $j")
        }
    }

    // return with label
    fun checkName(name: String, operation: (String) -> Unit): Unit = operation(name)
    checkName("Johnd") labelOperation@{
        if (it == "John") {
            println("Hola John")
            return@labelOperation
        }
        println("Hello $it")
    }

}