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

    fun solution2(survey: Array<String>, choices: IntArray): String {
        val scoreMap = mutableMapOf("RT" to 0, "CF" to 0, "JM" to 0, "AN" to 0)

        survey.forEachIndexed { index, key ->
            if (scoreMap.keys.contains(key)) {
                scoreMap[key] = scoreMap[key]!! + choices[index] - 4
            } else {
                scoreMap[key.reversed()] = scoreMap[key.reversed()]!! - (choices[index] - 4)
            }
        }

        var answer = ""
        scoreMap.forEach { (key, value) -> answer += if(value > 0) key[1] else key[0] }
        return answer
    }
}