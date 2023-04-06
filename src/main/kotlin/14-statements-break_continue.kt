fun main() {
    var i = 0
    while (i < 10) {
        println("a: $i")
        i++
        if (i == 4) {
            break
        }
    }

    var j = 0
    while (j < 10) {
        if (j == 4) {
            j++
            continue
        }
        println("b: $j")
        j++
    }

}