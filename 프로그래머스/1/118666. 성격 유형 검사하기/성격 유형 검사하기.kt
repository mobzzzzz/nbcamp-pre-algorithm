class Solution {
    fun solution(surveys: Array<String>, choices: IntArray): String {
        val scoreMap = mutableMapOf("R" to 0, "T" to 0, "C" to 0, "F" to 0, "J" to 0, "M" to 0, "A" to 0, "N" to 0)

        surveys.zip(choices.toTypedArray()).forEach { (survey, choice) ->
            val first = survey[0].toString()
            val second = survey[1].toString()

            when (choice) {
                in 1..3 -> scoreMap[first] = scoreMap[first]!! + 4 - choice
                in 5..7 -> scoreMap[second] = scoreMap[second]!! + choice - 4
            }
        }

        val builder = StringBuilder()

        builder.append(if (scoreMap["R"]!! >= scoreMap["T"]!!) "R" else "T")
        builder.append(if (scoreMap["C"]!! >= scoreMap["F"]!!) "C" else "F")
        builder.append(if (scoreMap["J"]!! >= scoreMap["M"]!!) "J" else "M")
        builder.append(if (scoreMap["A"]!! >= scoreMap["N"]!!) "A" else "N")

        return builder.toString()
    }
}