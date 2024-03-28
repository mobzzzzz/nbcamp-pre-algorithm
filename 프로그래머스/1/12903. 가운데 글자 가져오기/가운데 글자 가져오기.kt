class Solution {
    fun solution(s: String): String {
        val mid = s.length / 2
        
        return if (s.length % 2 == 1) {
            s.substring(mid, mid + 1)
        } else {
            s.substring(mid - 1, mid + 1)
        }
    }
}

class Solution2 {
    fun solution(s: String) =
    // with로 s 문자열을 수신 객체로 지정해 람다 안에서 객체를 추가로 명시하지 않아 간결함
    // substring 을 index가 아닌 IntRange를 사용해서 length의 홀/짝을 구분하지 않음
      with(s) { substring(length / 2 - 1 + (length % 2) .. length / 2) }
  }