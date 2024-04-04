class Solution {
    fun solution(s: String): Boolean = s.matches("\\d{4}|\\d{6}".toRegex())
}