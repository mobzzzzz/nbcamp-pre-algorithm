class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val stringBuilder = StringBuilder()
        
        ingredient.forEach {
            stringBuilder.append(it.toString())
            
            if (stringBuilder.length > 3 && 
                    stringBuilder.substring(stringBuilder.length - 4) == "1231") {
                stringBuilder.setLength(stringBuilder.length - 4)
                answer++
            }
        }
        
        return answer
    }
}