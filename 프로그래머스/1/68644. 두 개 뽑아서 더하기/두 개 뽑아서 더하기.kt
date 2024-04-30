class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = sortedSetOf<Int>()
        
        numbers.count().let { count ->
            for (i in 0 until count) {
                if (i > count - 1) break
                for (j in i + 1 until count) {
                    answer.add(numbers[i] + numbers[j])
                }
            }
        }
        
        return answer.toIntArray()
    }
}