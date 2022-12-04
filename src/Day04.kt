//use this file as template
fun main() {
    fun part1(input: List<String>): Int {
        var counter = 0
        input.forEach {
            val first = it.split(",").first().split("-").map { i -> i.toInt() }.zipWithNext().first()
            val last = it.split(",").last().split("-").map { i -> i.toInt() }.zipWithNext().first()
            if ((first.first <= last.first && first.second >= last.second) ||
                (last.first <= first.first && last.second >= first.second)
            ) {
                counter++
            }

        }
        return counter
    }

    fun part2(input: List<String>): Int {
        var counter = 0
        input.forEach {
            val a = it.split(",").first().split("-").map { i -> i.toInt() }.zipWithNext().first()
            val b = it.split(",").last().split("-").map { i -> i.toInt() }.zipWithNext().first()
            if (
                (a.first <= b.first && a.second >= b.first) ||
                (a.first >= b.first && b.second >= a.first)
            ) {
                counter++
            }

        }
        return counter
    }


    val testInput = readInput("Day04_test")
    check(part1(testInput) == 2)
    check(part2(testInput) == 4)


    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}
