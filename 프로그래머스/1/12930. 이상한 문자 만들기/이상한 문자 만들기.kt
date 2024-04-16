class Solution {
    fun solution(s: String): String = s.split(" ").map { 
        it.mapIndexed { index, char -> 
            if (index % 2 == 0) char.toUpperCase() else char.toLowerCase() }.joinToString("") 
    }.joinToString(" ")
}