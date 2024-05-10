class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int = score.sortedDescending()
            .subList(0, (score.size - score.size % m))
            .chunked(m)
            .map {
                it.minOrNull()!! * it.count()
            }.sum()
}