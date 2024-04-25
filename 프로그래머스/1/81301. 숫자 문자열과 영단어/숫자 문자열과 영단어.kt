class Solution {
    fun solution(s: String): Int {
        val numberPatternMap = mapOf(
            "zero" to 0,
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )
        
        var result = ""
        var stringForSearch = ""
        
        s.forEach { char ->
            if (char.isDigit()) result += char
            else {
                stringForSearch += char
                numberPatternMap.get(stringForSearch)?.let {
                    result += it
                    stringForSearch = ""
                }
            }
        }
        
        return result.toInt()
    }
}