class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var sqrtDouble: Double = Math.sqrt(n.toDouble())
        
        // toInt()는 Exception을 만들지 않고 소수점을 버림
        if (sqrtDouble.toInt().toDouble() == sqrtDouble)  {
            answer = Math.pow(sqrtDouble + 1.0, 2.0).toLong()
        } else {
            answer = -1
        }
        
        return answer
    }
}