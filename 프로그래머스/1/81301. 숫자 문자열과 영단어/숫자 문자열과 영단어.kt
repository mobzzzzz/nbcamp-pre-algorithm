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

    fun solution2(s: String): Int {
        var result = s
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
        
        numberPatternMap.forEach { result = result.replace(it.key, it.value.toString()) }
        
        return result.toInt()
    }

    fun solution3(s: String): Int = s
    .replace("one", "1")
    .replace("two", "2")
    .replace("three", "3")
    .replace("four", "4")
    .replace("five", "5")
    .replace("six", "6")
    .replace("seven", "7")
    .replace("eight", "8")
    .replace("nine", "9")
    .replace("zero", "0")
    .toInt()
}