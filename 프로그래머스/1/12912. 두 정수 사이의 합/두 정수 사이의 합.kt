class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        // var lowNum = if (a > b) b else a
        // var highNum = if (a > b) a else b
        var lowNum = minOf(a, b)
        var highNum = maxOf(a, b)
        
        for (i in lowNum..highNum) {
            answer += i.toLong()
        }
        
        return answer
    }
}