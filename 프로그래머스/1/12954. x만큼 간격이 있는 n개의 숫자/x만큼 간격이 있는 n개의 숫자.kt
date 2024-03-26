class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var array = mutableListOf<Long>()
        
        for (i in 1..n) {
            array.add(x * i.toLong())
        }
        
        answer = array.toLongArray()
        
        return answer
    }
}