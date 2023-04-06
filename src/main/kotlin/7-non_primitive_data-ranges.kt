fun main() {
    // data types
    val rangeAZ: IntRange = 1..100;
    val rangeZA: IntProgression = 100 downTo 1;
    val rangeWithStep: IntProgression = 1..100 step 10;

    // function
    println(rangeAZ.count())
    println(rangeAZ.contains(5))
    println(rangeAZ.contains(110))
    println(rangeAZ.first)
    println(rangeAZ.last)
    println(rangeAZ.step)

}