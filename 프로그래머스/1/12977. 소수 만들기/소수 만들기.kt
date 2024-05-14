class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val primeNumMap = mutableMapOf<Int, Boolean>()

        for (i in 0 until (nums.size - 2)) {
            for (j in (i + 1) until (nums.size - 1)) {
                for (k in (j + 1) until nums.size) {
                    val num = nums[i] + nums[j] + nums[k]

                    if (primeNumMap[num] == true) answer++
                    else if (isPrime(num)) {
                        primeNumMap[num] = true
                        answer++
                    }
                }
            }
        }

        return answer
    }
    
    fun isPrime(num: Int): Boolean {
        if (num == 1) return false
        
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        
        return true
    }
}