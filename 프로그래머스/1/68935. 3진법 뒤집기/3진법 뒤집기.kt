class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var list: MutableList<Int> = mutableListOf()
        var number = n
        
        while (number > 0) {
            list.add(number % 3)
            list.add(0, number % 3)
            number /= 3
        }
        
        answer = list.foldIndexed(0) { index, acc, num -> acc + (num * Math.pow(3.0, list.count() - index - 1.0)).toInt() }
        
        return answer
    }

    fun solution2(n: Int): Int {
        return n.toString(3).reversed().toInt(3)
    }
}