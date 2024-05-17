class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        
        for (knight in 1..number) {
            val attack = knight.divisorCount()
            
            if (attack <= limit) answer += attack
            else answer += power
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
}