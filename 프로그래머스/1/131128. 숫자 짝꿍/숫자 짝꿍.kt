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
}