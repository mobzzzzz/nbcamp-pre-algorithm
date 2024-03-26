class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var number = n
        while (number > 0) {
            answer += number % 10
            number /= 10
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin $answer")

        return answer
    }
}