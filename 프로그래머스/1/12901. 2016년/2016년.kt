import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

class Solution {
    fun solution(a: Int, b: Int): String = LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase()
}