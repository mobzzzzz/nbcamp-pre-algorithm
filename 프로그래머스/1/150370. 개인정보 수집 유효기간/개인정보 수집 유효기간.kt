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

    fun solution2(today: String, terms: Array<String>, privacies: Array<String>) = privacies.indices.filter {
        privacies[it].split(" ").first().split("\\.".toRegex()).map(String::toInt)
            .let { (y, m, d) -> (y * 12 * 28) + (m * 28) + d } + (terms.map { it.split(" ") }
            .associate { (a, b) -> a to b.toInt() }
            .getOrDefault(privacies[it].split(" ").last(), 0) * 28) <= today.split("\\.".toRegex()).map(String::toInt)
            .let { (y, m, d) -> (y * 12 * 28) + (m * 28) + d }
    }.map { it + 1 }
}