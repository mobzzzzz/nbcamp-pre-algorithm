class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
    
        for (i in (1..9)) {
            answer += if (numbers.contains(i)) 0 else i
        }
        
        return answer
    }
}