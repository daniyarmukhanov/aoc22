//use this file as template
fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        input.forEach {
            val left = it.substring(0, it.length / 2).toSet()
            val right = it.substring(it.length / 2, it.length).toSet()
            left.forEach { leftChar ->
                if (right.contains(leftChar)) {
                    var add = right.find { rightChar -> rightChar == leftChar }!!.toInt().minus(96)
                    if (add <= 0) {
                        add += 58
                    }
                    sum += add
                }
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        for (i in input.indices step 3) {
            val a = input[i].toSet()
            val b = input[i + 1].toSet()
            val c = input[i + 2].toSet()

            a.forEach {
                if (b.contains(it) && c.contains(it)) {
                    var add = a.find { q: Char -> q == it }!!.toInt().minus(96)
                    if (add <= 0) {
                        add += 58
                    }
                    sum += add
                }
            }

        }
        return sum
    }


    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
