fun main() {

    fun calcScorePart1(shapesList: List<String>): Int {
        var userScore = 0
        var gameScore = 0
        if (shapesList[1] == "X"){
            userScore = 1
            if (shapesList[0] == "A"){
                gameScore = 3
            }
            if (shapesList[0] == "B"){
                gameScore = 0
            }
            if (shapesList[0] == "C"){
                gameScore = 6
            }
        }
        if (shapesList[1] == "Y"){
            userScore = 2
            if (shapesList[0] == "A"){
                gameScore = 6
            }
            if (shapesList[0] == "B"){
                gameScore = 3
            }
            if (shapesList[0] == "C"){
                gameScore = 0
            }
        }
        if (shapesList[1] == "Z"){
            userScore = 3
            if (shapesList[0] == "A"){
                gameScore = 0
            }
            if (shapesList[0] == "B"){
                gameScore = 6
            }
            if (shapesList[0] == "C"){
                gameScore = 3
            }
        }
        return userScore + gameScore
    }

    fun part1(input: List<String>): Int {
        var splitList = input.map { game -> game.split(" ") }
        var totalScore = 0
        for (item in splitList) {
            totalScore += calcScorePart1(item)
        }
        return totalScore
    }

    fun calcScorePart2(shapesList: List<String>): Int {
        var roundScore = 0
        var userScore = 0
        if (shapesList[1] == "X"){
            roundScore = 0
            if (shapesList[0] == "A"){
                userScore = 3
            }
            if (shapesList[0] == "B"){
                userScore = 1
            }
            if (shapesList[0] == "C"){
                userScore = 2
            }
        }
        if (shapesList[1] == "Y"){
            roundScore = 3
            if (shapesList[0] == "A"){
                userScore = 1
            }
            if (shapesList[0] == "B"){
                userScore = 2
            }
            if (shapesList[0] == "C"){
                userScore = 3
            }
        }
        if (shapesList[1] == "Z"){
            roundScore = 6
            if (shapesList[0] == "A"){
                userScore = 2
            }
            if (shapesList[0] == "B"){
                userScore = 3
            }
            if (shapesList[0] == "C"){
                userScore = 1
            }
        }
        return roundScore + userScore
    }

    fun part2(input: List<String>): Int {
        var splitList = input.map { game -> game.split(" ") }
        var totalScore = 0
        for (item in splitList) {
            totalScore += calcScorePart2(item)
        }
        return totalScore
    }


    val input = readInput("Day02")
    //println(part1(input))
    println(part2(input))
}