class Solution {
    fun solution(phone_number: String): String = 
        phone_number.substring(0, phone_number.length - 4)
            .replace(Regex("\\d"), "*") + phone_number.takeLast(4)
}