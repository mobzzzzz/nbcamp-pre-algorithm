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