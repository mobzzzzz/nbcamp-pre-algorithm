class Solution {
    fun solution(X: String, Y: String): String {
        val xArray = IntArray(10)
        val yArray = IntArray(10)
        var pairText = ""

        X.forEach {
            xArray[it.digitToInt()]++
        }

        Y.forEach {
            if (xArray[it.digitToInt()] > 0) {
                yArray[it.digitToInt()]++
            }
        }
        
        val stringBuilder = StringBuilder()
        (9 downTo 0).forEach { currentNum ->
            val xCount = xArray[currentNum]
            val yCount = yArray[currentNum]
            val minCount = minOf(xCount, yCount)

            repeat(minCount) { stringBuilder.append(currentNum) }
        }
        
        pairText = stringBuilder.toString()

        if (pairText.isEmpty()) return "-1"
        else if (pairText.all { it == '0' }) return "0"
        return pairText
    }

    fun solution3(X: String, Y: String): String {
        val pairNumList = mutableListOf<Char>()
        var xList = X.toMutableList()
        var yList = Y.toMutableList()
        var index = 0

        while (xList.isNotEmpty()) {
            val xChar = xList[index]

            yList.firstOrNull { it == xChar }?.let {
                xList.removeAt(xList.indexOf(xChar))
                yList.removeAt(yList.indexOf(xChar))
                pairNumList.add(xChar)
            } ?: xList.removeAll { it == xChar }
        }

        if (pairNumList.isEmpty()) return "-1"
        else if (pairNumList.all { it == '0' }) return "0"
        return pairNumList.sortedDescending().joinToString("")
    }

    fun solution2(X: String, Y: String): String {
        val xMap = mutableMapOf<Char, Int>()
        val yMap = mutableMapOf<Char, Int>()
        var pairText = ""

        X.forEach {
            xMap[it] = xMap.getOrDefault(it, 0) + 1
        }

        Y.forEach {
            yMap[it] = yMap.getOrDefault(it, 0) + 1
        }

        (9 downTo 0).forEach { currentNum ->
            val xCount = xMap.getOrDefault(currentNum.digitToChar(), 0)
            val yCount = yMap.getOrDefault(currentNum.digitToChar(), 0)
            val minCount = minOf(xCount, yCount)

            repeat(minCount) { pairText += currentNum }
        }

        if (pairText.isEmpty()) return "-1"
        else if (pairText.all { it == '0' }) return "0"
        return pairText
    }
}