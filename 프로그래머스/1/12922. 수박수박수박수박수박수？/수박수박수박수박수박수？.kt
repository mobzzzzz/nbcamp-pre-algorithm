class Solution {
    fun solution(n: Int): String = "수박".repeat (n / 2) + if (n % 2 == 1) "수" else ""

    fun solution2(n: Int): String {
        var answer = ""
        var keyword = "수박씨앗"

        answer = keyword.repeat (n / keyword.length) + keyword.substring(0, n % keyword.length)

        return answer
    }
}