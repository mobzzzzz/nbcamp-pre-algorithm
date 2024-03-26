class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        answer = if (0 < angle && angle < 90) {
            1
        } else if (angle == 90) {
            2
        } else if (90 < angle && angle < 180) {
            3
        } else {
            // if-else if문을 사용하여 변수에 즉시 값을 대입할때는 else가 선택사항이 아니라 필수
            // angle에 대한 문제의 제한사항이 정해져 있어 해당 문제에선 이렇게 사용할 수 있지만 이외의 경우엔 예외가 발생 가능
            4
        }
        return answer
    }
}