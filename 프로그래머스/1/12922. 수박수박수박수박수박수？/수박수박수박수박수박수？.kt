class Solution {
    fun solution(n: Int): String = "수박".repeat (n / 2) + if (n % 2 == 1) "수" else ""
}