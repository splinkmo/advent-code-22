fun main() {
    fun part1(input: List<String>): Int {
        var maxCalorie = 0
        var elfCalories = 0
        for (value in input){
            if (value != ""){
                elfCalories += value.toInt()
            }
            else {
                if (elfCalories > maxCalorie) {
                    maxCalorie = elfCalories
                }
                elfCalories = 0
            }
        }
        return maxCalorie
    }

    fun part2(input: List<String>): Int {
        val maxCalArray = arrayOf(0,0,0)
        var elfCalories = 0
        for (value in input){
            if (value != ""){
                elfCalories += value.toInt()
            }
            else {
                if (elfCalories > maxCalArray[0]) {
                    println("Replacing " + maxCalArray[0] + " with $elfCalories")
                    maxCalArray[0] = elfCalories
                    maxCalArray.sort()
                }
                elfCalories = 0
            }
        }
        if (elfCalories > maxCalArray[0]) {
            println("Replacing " + maxCalArray[0] + " with $elfCalories")
            maxCalArray[0] = elfCalories
            maxCalArray.sort()
        }
        return maxCalArray[0] + maxCalArray[1] + maxCalArray[2]
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    //println(part2(testInput))


    val input = readInput("Day01")
    //println(part1(input))
    println(part2(input))

}
