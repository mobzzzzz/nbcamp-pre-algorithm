class Solution {
    fun solution(n: Long): IntArray {
        var answer = mutableListOf<Int>()
        var number: Long = n
        
        while (number > 0) {
            answer.add((number % 10).toInt())
            number /= 10
        }
        
        return answer.toIntArray()
    }
}