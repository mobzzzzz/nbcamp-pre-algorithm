class Solution {
    fun solution(s: String, n: Int): String = s.map { 
        if (it == ' ') it 
        else {
            (if (it.isUpperCase()) ('A'..'Z') else ('a'..'z'))
                .let { range ->
                    range.elementAt((range.indexOf(it) + n) % range.count())
                }
        }
    }.joinToString("")
}