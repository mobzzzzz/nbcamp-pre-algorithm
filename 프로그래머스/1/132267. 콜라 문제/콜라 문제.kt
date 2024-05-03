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

    fun solution2(a: Int, b: Int, n: Int): Int {
        return (if (n > b) n - b else 0) / (a - b) * b
    }
}