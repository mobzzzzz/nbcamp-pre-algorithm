class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        for (i in left..right) {
            answer += if (i.divisorCount() % 2 == 1) i * -1 else i
        }
        
        return answer
    }
    
    fun Int.divisorCount(): Int {
        var count = 0
        val sqrt = Math.sqrt(this.toDouble()).toInt()
        
        for (i in 1..sqrt) {
            if (this % i == 0) {
                count += if (i * i == this) 1 else 2
            }
        }
        
        return count
    }

    fun solution2(left: Int, right: Int): Int = (left..right).map { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }.sum()
}