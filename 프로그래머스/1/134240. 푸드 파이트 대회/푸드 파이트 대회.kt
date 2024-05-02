class Solution {
    fun solution(food: IntArray): String {
        val tempFoodList = mutableListOf<Int>()
        
        food.sliceArray(1..(food.count() - 1)).forEachIndexed { index, foodCount ->
            repeat(foodCount / 2) { tempFoodList.add(index + 1) }
        }
        
        return tempFoodList.joinToString("") + "0" + tempFoodList.reversed().joinToString("")
    }

    fun solution2(food: IntArray): String {
        val sb = StringBuilder()
        for (i in 1..food.lastIndex) {
            repeat(food[i] / 2) { sb.append(i) }
        }
        val reversed = sb.reversed()
        sb.append(0)
        sb.append(reversed)
        return sb.toString()
    }

    fun solution3(food: IntArray): String {
        var answer: String = ""

        food.forEachIndexed { index, i -> if(index != 0) for(i in 1 .. i / 2) answer += index }

        var temp = answer.reversed()
        answer = answer + "0" + temp

        return answer
    }
}