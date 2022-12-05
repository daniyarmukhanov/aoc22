fun main() {
    fun part1(inputStack: Array<String>, input: List<String>): String {
        input.forEachIndexed { index, line ->
            val digits = line.split(" ").mapNotNull { it.toIntOrNull() }
            val size = digits[0]
            val from = digits[1] - 1
            val to = digits[2] - 1

            repeat(size) {
                inputStack[to] =
                    inputStack[to].toMutableList().apply { add(inputStack[from].toCharArray().last()) }.joinToString("")
                inputStack[from] = inputStack[from].toMutableList().apply { removeLast() }.joinToString("")
            }


        }

        return inputStack.map { it.last() }.joinToString("")
    }

    fun part2(inputStack: Array<String>, input: List<String>): String {
        input.forEachIndexed { index, line ->
            val digits = line.split(" ").mapNotNull { it.toIntOrNull() }
            val size = digits[0]
            val from = digits[1] - 1
            val to = digits[2] - 1

            val fromStr = inputStack[from]
            inputStack[to] =
                inputStack[to].toMutableList().apply { addAll(fromStr.toList().takeLast(size)) }.joinToString("")
            inputStack[from] = fromStr.toMutableList().take(inputStack[from].length - size).joinToString("")

        }
        return inputStack.map { it.last() }.joinToString("")
    }


    val testInput = readInput("Day05_test")
    check(part1(inputTest, testInput) == "CMZ")
    check(part2(inputTestPart2, testInput) == "MCD")

    val input = readInput("Day05")
    println(part1(inputData, input))
    println(part2(inputDataPart2, input))
}

val inputTest = arrayOf("ZN", "MCD", "P")
val inputTestPart2 = arrayOf("ZN", "MCD", "P")


val inputData = mutableListOf<String>().apply {
    add("FCPGQR")
    add("WTCP")
    add("BHPMC")
    add("LTQSMPR")
    add("PHJZVGN")
    add("DPJ")
    add("LGPZFJTR")
    add("NLHCFPTJ")
    add("GVZQHTCW")
}.toTypedArray()

val inputDataPart2 = mutableListOf<String>().apply {
    add("FCPGQR")
    add("WTCP")
    add("BHPMC")
    add("LTQSMPR")
    add("PHJZVGN")
    add("DPJ")
    add("LGPZFJTR")
    add("NLHCFPTJ")
    add("GVZQHTCW")
}.toTypedArray()

