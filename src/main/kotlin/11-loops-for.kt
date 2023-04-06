fun main() {
    // for loops with array
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    // for loops with range
    val rangeAZ: IntRange = 1..5;
    for (x in rangeAZ) {
        println(x)
    }
}