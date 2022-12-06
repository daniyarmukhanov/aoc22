import java.io.File

//use this file as template
fun main() {
    val input = File("src", "Day06.txt").readText()
    println(findMarker(input))
}


fun findMarker(buffer: String): Int {
    // Keep track of the last four characters received
    val lastFour = mutableListOf("", "", "", "", "", "", "", "", "", "", "", "", "", "")

    // Process each character in the buffer
    for (i in buffer.indices) {
        // Add the new character to the list of last four characters
        lastFour.removeAt(0)
        lastFour.add(buffer[i].toString())

        // Check if the last four characters are all different
        if (lastFour.filter { it.isNotEmpty() }.toSet().size == 14) {
            // If so, return the number of characters processed so far
            return i + 1
        }
    }

    // If no marker was found, return -1
    return -1
}
