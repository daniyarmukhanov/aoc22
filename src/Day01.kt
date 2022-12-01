fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var sum = 0
        input.forEach {
            if (it.isNotEmpty()) {
                sum += it.toInt()
            } else {
                if (sum > max) {
                    max = sum
                }
                sum = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        val list = mutableListOf<Int>()
        input.forEach {
            if (it.isNotEmpty()) {
                sum += it.toInt()
            } else {
                list.add(sum)
                sum = 0
            }
        }

        return list.apply { sort() }.takeLast(3).sum()

    }


    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
