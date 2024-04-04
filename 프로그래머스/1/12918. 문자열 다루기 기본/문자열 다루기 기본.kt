class Solution {
    fun solution(s: String): Boolean = s.matches("\\d{4}|\\d{6}".toRegex())

    fun solution2(s: String): Boolean = s.matches("[0-9]{4}|[0-9]{6}".toRegex())

    fun solution3(s: String): Boolean = s.matches("\\d{4}(?:\\d{2})?".toRegex())

    fun solution4(s: String) = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

    fun solution5(s: String) = s.all { it.isDigit() } && ((s.length == 4) || (s.length == 6))
}