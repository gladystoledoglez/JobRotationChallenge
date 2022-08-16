fun main() {
    exerciseOne()
    exerciseTwo(34)
    exerciseFive("gladys")
}

/**
 * Sum number
 */
fun exerciseOne() {
    val index = 13
    var sum = 0
    var k = 0
    while (k < index) {
        k += 1
        sum += k
    }
    println(sum)
}

/**
 * Fibonacci number
 */
fun exerciseTwo(number: Int) {
    val sequence: MutableList<Int> = mutableListOf()
    for (n in 0..number + 1) {
        val value = if (n > 1) sequence[n - 1] + sequence[n - 2] else n
        sequence.add(value)
    }
    if (sequence.contains(number))
        println("O número: '$number' pertence a sequência")
    else
        println("O número: '$number' não pertence a sequência")
}

/**
 * String reverse
 */
fun exerciseFive(str: String) {
    var result = ""
    var index = str.lastIndex
    while (index >= 0) {
        result += str[index]
        index--
    }
    println(result)
}


