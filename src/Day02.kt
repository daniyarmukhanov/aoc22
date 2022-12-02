//use this file as template
fun main() {
    fun part1(input: List<String>): Int {
        var winningPoint = 0
        var sum = 0
        input.forEach {
            val a = it.split(" ").first()
            val b = it.split(" ").last()
            val point = when (b) {
                "X" -> 1
                "Y" -> 2
                else -> 3
            }
            if (a == "A" && b == "X")
                winningPoint = 3
            else if (a == "A" && b == "Y")
                winningPoint = 6
            else if (a == "A" && b == "Z")
                winningPoint = 0
            else if (a == "B" && b == "X")
                winningPoint = 0
            else if (a == "B" && b == "Y")
                winningPoint = 3
            else if (a == "B" && b == "Z")
                winningPoint = 6
            else if (a == "C" && b == "X")
                winningPoint = 6
            else if (a == "C" && b == "Y")
                winningPoint = 0
            else if (a == "C" && b == "Z")
                winningPoint = 3

            sum += (point + winningPoint)
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var winningPoint = 0
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


            val point = when (b) {
                "X" -> 1
                "Y" -> 2
                else -> 3
            }
            if (a == "A" && b == "X")
                winningPoint = 3
            else if (a == "A" && b == "Y")
                winningPoint = 6
            else if (a == "A" && b == "Z")
                winningPoint = 0
            else if (a == "B" && b == "X")
                winningPoint = 0
            else if (a == "B" && b == "Y")
                winningPoint = 3
            else if (a == "B" && b == "Z")
                winningPoint = 6
            else if (a == "C" && b == "X")
                winningPoint = 6
            else if (a == "C" && b == "Y")
                winningPoint = 0
            else if (a == "C" && b == "Z")
                winningPoint = 3

            sum += (point + winningPoint)

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
