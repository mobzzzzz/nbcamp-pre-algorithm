class Solution {
    fun solution(s: String) =
        s.split(" ")
            .map { it.lowercase() }
            .joinToString(" ") { it.replaceFirstChar(Char::uppercaseChar) }
}