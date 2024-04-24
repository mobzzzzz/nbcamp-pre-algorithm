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
    
    fun solution2(s: String, n: Int): String =
        s.toList().joinToString(separator = "") {
            when (it) {
                in 'A'..'Z' -> ('A'.toInt() + (it.toInt() - 'A'.toInt() + n) % ('Z' - 'A' + 1)).toChar()
                in 'a'..'z' -> ('a'.toInt() + (it.toInt() - 'a'.toInt() + n) % ('z' - 'a' + 1)).toChar()
                else -> it
            }.toString()
        }

        fun solution3(s: String, n: Int): String =
        s.map {
            when {
                it.isLowerCase() -> 'a' + (it + n - 'a') % 26
                it.isUpperCase() -> 'A' + (it + n - 'A') % 26
                else -> ' '
            }
        }.joinToString("")
}