fun main() {
    fun binarySort(searchChar: Char, charList: List<Char>): Boolean{
        if (charList.size <= 1){
            return charList[0] == searchChar
        }
        var chunkedValue = if (charList.size % 2 == 0) charList.size/2 else charList.size/2 + 1
        return if (searchChar < charList[chunkedValue]) {
            var splitChars = charList.chunked(chunkedValue)
            binarySort(searchChar, splitChars[0])
        } else {
            var splitChars = charList.chunked(chunkedValue)
            binarySort(searchChar, splitChars[1])
        }
    }
    fun letterScore(letter: Char): Int{
        return if (letter.isLowerCase()) letter.code - 96 else letter.code - 38
    }

    fun part1(input: List<String>): Int {
        var priorityScore = 0
        var ruckSackList = input.map { it.chunked(it.length/2) }
        for (compartments in ruckSackList){
            var compartment1 = compartments[0].toList().sorted()
            var compartment2 = compartments[1].toList().sorted()
            for (item in compartment1){
                if (binarySort(item, compartment2)) {
                    priorityScore += letterScore(item)
                    break
                }
            }
        }
        return priorityScore
    }

    fun part2(input: List<String>): Int {
        var ruckSackGroup = input.chunked(3).flatMap { it -> (it[0].toSet() intersect it[1].toSet()) intersect it[2].toSet() }
        return ruckSackGroup.map { it -> letterScore(it) }.sum()
    }

    val input = readInput("Day03")
    //println(part1(input))
    println(part2(input))
}