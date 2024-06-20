class Solution {
    fun solution(idList: Array<String>, report: Array<String>, k: Int): IntArray {
        val reportedCountMapByReporter = mutableMapOf<String, MutableSet<String>>()


        report.forEach {
            val splitedReport = it.split(" ")
            val reporter = splitedReport[0]
            val reported = splitedReport[1]

            if (reportedCountMapByReporter.containsKey(reported)) {
                reportedCountMapByReporter[reported]!!.add(reporter)
            } else {
                reportedCountMapByReporter[reported] = mutableSetOf(reporter)
            }
        }

        val answer = idList.associateWith { 0 }.toMutableMap()

        reportedCountMapByReporter.values.forEach { reporters ->
            if (reporters.size >= k) {
                reporters.forEach {
                    answer[it] = answer[it]!! + 1
                }
            }
        }

        return answer.values.toIntArray()
    }

    fun solution2(id_list: Array<String>, report: Array<String>, k: Int): IntArray =
    report.map { it.split(" ") }
        .groupBy { it[1] }
        .asSequence()
        .map { it.value.distinct() }
        .filter { it.size >= k }
        .flatten()
        .map { it[0] }
        .groupingBy { it }
        .eachCount()
        .run { id_list.map { getOrDefault(it, 0) }.toIntArray() }
}