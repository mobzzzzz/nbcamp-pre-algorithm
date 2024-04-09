class Solution {
    fun solution(n: Int, m: Int): IntArray = chda(n, m).let { intArrayOf(it, n * m / it) }
    
    tailrec fun chda(n: Int, m: Int): Int {
        return when {
            m == 0 -> n
            else -> chda(m, n % m)
        }
    }
}