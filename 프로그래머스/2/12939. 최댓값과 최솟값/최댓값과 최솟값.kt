class Solution {
    fun solution(s: String) =
        s.split(" ")
            .map { it.toInt() }
            .let { "${it.minOrNull()} ${it.maxOrNull()}" }
}