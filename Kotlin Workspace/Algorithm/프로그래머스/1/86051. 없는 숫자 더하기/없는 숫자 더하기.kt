class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
    
        for (i in (1..9)) {
            answer += if (numbers.contains(i)) 0 else i
        }
        
        return answer
    }
}

class Solution2 {
    fun solution(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()
}

class Solution3 {
    fun solution(numbers: IntArray): Int  = 45 - numbers.sum()
}