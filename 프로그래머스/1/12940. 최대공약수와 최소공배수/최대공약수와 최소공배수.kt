class Solution {
    fun solution(n: Int, m: Int): IntArray = chda(n, m).let { intArrayOf(it, n * m / it) }
    
    tailrec fun chda(n: Int, m: Int): Int {
        return when {
            m == 0 -> n
            else -> chda(m, n % m)
        }
    }

    fun solution2(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)

        return intArrayOf(gcd, n * m / gcd)
    }

    tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}