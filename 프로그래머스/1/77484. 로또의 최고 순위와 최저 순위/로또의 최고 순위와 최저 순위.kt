class Solution {
    fun solution(lottos: IntArray, wins: IntArray): IntArray {
        val certainWinCount = lottos.count { wins.contains(it) }
        val zeroCount = lottos.count { it == 0 }
        
        return intArrayOf(
            minOf(7 - (certainWinCount + zeroCount), 6), 
            minOf(7 - certainWinCount, 6)
        )
    }
}