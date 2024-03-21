class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var list: MutableList<Int> = mutableListOf()
        var number = n
        
        while (number > 0) {
            list.add((number % 10L).toInt())
            number /= 10L
        }
        
        answer = list.sortedDescending().joinToString("").toLong()
        
        return answer
    }
}