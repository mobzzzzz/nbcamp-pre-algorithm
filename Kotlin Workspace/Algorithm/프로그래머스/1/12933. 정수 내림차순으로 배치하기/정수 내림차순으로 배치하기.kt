class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var list: MutableList<Int> = mutableListOf()
        var number = n
        // 최초답안
        // while (number > 0) {
        //     list.add((number % 10L).toInt())
        //     number /= 10L
        // }
        // answer = list.sortedDescending().joinToString("""").toLong()
        
        // 간략하게 줄인 답안
        answer = number.toString().map { it.toString().toInt() }
            .sortedDescending()
            .joinToString("")
            .toLong()
        
        return answer
    }
}