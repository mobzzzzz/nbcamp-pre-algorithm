class Solution {
    fun solution(answers: IntArray): IntArray {
        val onePattern = intArrayOf(1, 2, 3, 4, 5)
        val twoPattern = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val threePattern = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var (one, two, three) = Array(3) { 0 }

        answers.forEachIndexed { index, answer ->
            if (onePattern[index % onePattern.size] == answer) { one++ }
            if (twoPattern[index % twoPattern.size]  == answer) { two++ }
            if (threePattern[index % threePattern.size]  == answer) { three++ }
        }

        val answerArray: IntArray = intArrayOf(one, two, three)
            .mapIndexed { index, value -> index + 1 to value }
            .filter { it.second == intArrayOf(one, two, three).maxOrNull() ?: 0 }
            .map { it.first }
            .toIntArray()

        return answerArray
    }
}