class Solution {
    fun solution(n: Int) = fastFibonacci(n)

    fun fastFibonacci(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1

        var current = 1
        var prev = 0
        
        for (i in 2..n) {
            val temp = current
            current = (current + prev) % 1234567
            prev = temp
        }
        
        return current
    }
}