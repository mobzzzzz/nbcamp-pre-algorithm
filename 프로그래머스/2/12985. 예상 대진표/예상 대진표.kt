class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var first = a
        var second = b

        while (first != second) {
            answer += 1
            first = first / 2 + first % 2
            second = second / 2 + second % 2
        }

        return answer
    }
}