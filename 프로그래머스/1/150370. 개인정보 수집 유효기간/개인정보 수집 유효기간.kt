class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val termsMap = terms.map { it.split(" ") }.associate { it[0] to it[1].toLong() }
        val privaciesPairList = privacies.map { it.split(" ") }.map { it[0] to it[1] }
        var index = 0

        val (todayYear, todayMonth, todayDay) = today.split(".").map { it.toInt() }

        privaciesPairList.forEach { (privacyDate, term) ->
            index++
            var (expireYear, expireMonth, expireDay) = privacyDate.split(".").map { it.toInt() }

            expireDay += termsMap[term]!!.toInt() * 28

            if (expireDay > 28) {
                expireMonth += expireDay / 28
                expireDay %= 28
            }

            if (expireMonth > 12) {
                expireYear += expireMonth / 12
                expireMonth %= 12
                
                if (expireMonth == 0) {
                    expireYear--
                    expireMonth = 12
                }
            }

            if (todayYear > expireYear ||
                (todayYear == expireYear && todayMonth > expireMonth) ||
                (todayYear == expireYear && todayMonth == expireMonth && todayDay >= expireDay)) {
                answer += index
            }
        }

        return answer
    }
}