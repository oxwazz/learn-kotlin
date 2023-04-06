fun main() {
    val day = 4

    // single option
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    // multiple option
    val result2 = when (day) {
        1, 2, 3, 4, 5 -> "Weekday"
        6, 7 -> "Weekend"
        else -> "Invalid day."
    }
    println(result2)

    // when in (check data inside array)
    val nilai: String = "A"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    val result3 = when (nilai) {
        in nilaiLulus -> "Lulus"
        !in nilaiLulus -> "Tidak Lulus"
        else -> "Invalid"
    }
    println(result3)

    // when is (check data type)
    val name: String = "A"
    val result4 = when (name) {
        is String -> "This is string"
        !is String -> "This is not string"
        else -> "Invalid"
    }
    println(result4)

    // when without parameter (when is equal to if else)
    val nilaiUjian: Int = 80
    val result5 = when {
        nilaiUjian > 50 -> "Lulus"
        nilaiUjian <= 50 -> "Tidak Lulus"
        else -> "Invalid"
    }
    println(result5)
}