class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        
        answer = signs.withIndex().map { (index, sign) ->
            if (sign) absolutes[index] else -absolutes[index]
        }.sum()
        
        return answer
    }
}