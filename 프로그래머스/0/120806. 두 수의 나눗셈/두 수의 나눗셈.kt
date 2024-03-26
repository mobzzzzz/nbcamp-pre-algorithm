class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        // 최초 답안, 명시적 캐스팅으로 계산
        // answer = ((num1 / num2.toDouble()) * 1000).toInt()
        // 수정 답안, 간결하게 표현함 암시적 캐스팅으로 연산에 미리 Double을 줘서 자동 캐스팅함
        answer = (num1 * 1000.0 / num2).toInt()
        return answer
    }
}