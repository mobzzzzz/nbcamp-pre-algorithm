class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var calculatedColaCount = n
        
        while (calculatedColaCount >= a) {
            (calculatedColaCount / a * b).let {
                answer += it
                calculatedColaCount = it + (calculatedColaCount % a)
            }
        }
        
        return answer
    }
}