class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()

        val sum = brown + yellow

        for (i in 1..sum) {
            if (sum % i == 0) {
                val width = sum / i
                val height = i

                if (width < height) {
                    continue
                }

                if ((width - 2) * (height - 2) == yellow) {
                    answer = intArrayOf(width, height)
                    break
                }
            }
        }

        return answer
    }

    fun solution2(brown: Int, red: Int): IntArray {
        return (1..red)
            .filter { red % it == 0 }
            .first { brown == (red / it * 2) + (it * 2) + 4 }
            .let { intArrayOf(red / it + 2, it + 2) }
    }
}