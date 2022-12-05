//use this file as template
fun main() {
    fun part1(input: List<String>): Int {
        return input.fold(0) { acc, s ->
            acc + findPoint(s.split(" ").first(), s.split(" ").last())
        }
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        input.forEach {
            val a = it.split(" ").first()
            lateinit var b: String
            when (it.split(" ").last()) {
                "Z" -> {
                    b = when (a) {
                        "A" -> "Y"
                        "B" -> "Z"
                        else -> "X"
                    }
                }

                "X" -> {
                    b = when (a) {
                        "A" -> "Z"
                        "B" -> "X"
                        else -> "Y"
                    }
                }

                else -> {
                    b = when (a) {
                        "A" -> "X"
                        "B" -> "Y"
                        else -> "Z"
                    }
                }
            }
            sum += findPoint(a, b)
        }
        return sum
    }


    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

fun findPoint(a: String, b: String): Int {
    val point = when (b) {
        "X" -> 1
        "Y" -> 2
        else -> 3
    }

    val winningPoint =
        if (a == "A" && b == "X")
            3
        else if (a == "A" && b == "Y")
            6
        else if (a == "A" && b == "Z")
            0
        else if (a == "B" && b == "X")
            0
        else if (a == "B" && b == "Y")
            3
        else if (a == "B" && b == "Z")
            6
        else if (a == "C" && b == "X")
            6
        else if (a == "C" && b == "Y")
            0
        else
            3

    return point + winningPoint
}
