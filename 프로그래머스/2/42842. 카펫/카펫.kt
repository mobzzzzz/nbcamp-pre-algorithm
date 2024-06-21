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
}