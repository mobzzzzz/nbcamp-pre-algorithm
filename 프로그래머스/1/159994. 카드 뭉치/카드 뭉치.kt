class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var answer = ""

    val cards1List = cards1.toMutableList()
    val cards2List = cards2.toMutableList()
    val goalList = goal.toMutableList()
    var breakFlag = false

    while (goalList.isNotEmpty()) {
        val goalKeyword = goalList.removeFirst()

        if (cards1List.getOrNull(0) == goalKeyword) {
            cards1List.removeAt(0)
        } else if (cards2List.getOrNull(0) == goalKeyword) {
            cards2List.removeAt(0)
        } else {
            breakFlag = true
            break
        }
    }

    answer = if (breakFlag) "No" else "Yes"

    return answer
}
}