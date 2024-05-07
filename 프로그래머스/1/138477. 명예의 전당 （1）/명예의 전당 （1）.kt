class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val scoreList = ArrayList<Int>()
        val lastScoreList = ArrayList<Int>()
        
        score.forEach {
            scoreList.add(it)
            scoreList.sortDescending()
            if (scoreList.count() > k) { scoreList.removeLast() }
            lastScoreList.add(scoreList.last())
        }
        
        return lastScoreList.toIntArray()
    }
}