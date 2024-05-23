class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val actualLost = lost.filterNot { it in reserve }.sorted()
        val actualReserve = reserve.filterNot { it in lost }.sorted().toMutableList()
        
        var answer = n - actualLost.size
        
        for (student in actualLost) {
            when {
                actualReserve.contains(student - 1) -> {
                    actualReserve.remove(student - 1)
                    answer++
                }
                actualReserve.contains(student + 1) -> {
                    actualReserve.remove(student + 1)
                    answer++
                }
            }
        }

        return answer
    }
}