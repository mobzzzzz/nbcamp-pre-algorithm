class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var x = ' '
        var xCount = 0
        var notXCount = 0

        s.forEachIndexed { index, it ->
            val isLastIndex = index == s.length - 1 
            if (!isLastIndex && xCount == 0) {
                xCount++
                x = it
            } else {
                if (it == x) xCount++
                else notXCount++

                if (xCount == notXCount) {
                    answer++
                    xCount = 0
                    notXCount = 0
                } else if (isLastIndex) {
                    answer++
                }
            }
        }

        return answer
    }
}