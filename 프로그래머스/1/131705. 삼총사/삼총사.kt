class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        var max = number.count() - 1
        
        for (i in 0..max) {
            for (j in i + 1..max) {
                for (k in j + 1..max) {
                    if (number[i] + number[j] + number[k] == 0) answer += 1
                }
            }
        }
        
        return answer
    }
}