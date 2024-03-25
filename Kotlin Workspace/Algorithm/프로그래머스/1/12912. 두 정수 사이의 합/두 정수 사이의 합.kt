class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        // var lowNum = if (a > b) b else a
        // var highNum = if (a > b) a else b
        var lowNum = minOf(a, b).toLong()
        var highNum = maxOf(a, b).toLong()
        
        answer = (lowNum..highNum).toList().sum()
        
        // for (i in lowNum..highNum) {
        //     answer += i.toLong()
        // }
        
        return answer
    }
}