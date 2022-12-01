
//use this file as template
fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val testInput = readInput("Day0_test")
    check(part1(testInput) == 0)

    val input = readInput("Day0")
    println(part1(input))
    println(part2(input))
}
