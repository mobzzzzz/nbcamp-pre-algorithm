class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int = score.sortedDescending()
            .subList(0, (score.size - score.size % m))
            .chunked(m)
            .map {
                it.minOrNull()!! * it.count()
            }.sum()

    fun solution2(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val apple =  Array<Int>(k) {0}
    
        for(s in score) {
            apple[s-1] += 1
        }
    
        for(i in k-1 downTo 0) {
           if(apple[i] % m != 0 && i > 0) {
               val down = apple[i] % m
               apple[i] -= down
               apple[i-1] += down
           }
           answer += (apple[i] / m) * (i+1) * m
        }
    
    
        return answer
    }
}