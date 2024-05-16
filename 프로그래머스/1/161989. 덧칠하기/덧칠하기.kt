class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        val wallStateList = (0 until n).map { !section.contains(it + 1) }.toMutableList()
        var loopIndex = 0

        while (loopIndex < n) {
            if (!wallStateList[loopIndex]) {
                answer += 1
                
                for (i in 0 until m) {
                    if (loopIndex + i >= n) break
                    wallStateList[loopIndex + i] = true
                }
                
                loopIndex += m
            } else {
                loopIndex++
            }
        }

        return answer
    }
}