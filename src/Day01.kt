fun main() {
    fun part1(input: List<String>) = sortBySum(input).last()
    fun part2(input: List<String>) = sortBySum(input).takeLast(3).sum()

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

fun sortBySum(input: List<String>): List<Int> {
    return input.fold(mutableListOf(mutableListOf())) { acc: MutableList<MutableList<String>>, s: String ->
        if (s.isNotEmpty()) {
            acc.apply { last().add(s) }
        } else {
            acc.apply { add(mutableListOf()) }
        }
    }.map { s -> s.sumOf { it.toInt() } }.sorted()
}
