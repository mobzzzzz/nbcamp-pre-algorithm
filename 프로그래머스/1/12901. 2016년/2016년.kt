import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

class Solution {
    fun solution(a: Int, b: Int): String = LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase()

    fun solution(a: Int, b: Int): String {
        val week = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")

        var answer = ""
        var days = b

        for (i in 1 until a) {
            days += when (i) {
                1, 3, 5, 7, 8, 10, 12 -> 31
                2 -> 29
                else -> 30
            }
        }

        answer = week[days % 7]
        return answer
    }
}