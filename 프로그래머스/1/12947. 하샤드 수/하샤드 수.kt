class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        
        sum = x.toString().map { it.toString().toInt() }.sum()
        answer = x % sum == 0
        
        return answer
    }
}