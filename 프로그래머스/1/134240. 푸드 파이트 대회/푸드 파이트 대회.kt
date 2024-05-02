class Solution {
    fun solution(food: IntArray): String {
        val tempFoodList = mutableListOf<Int>()
        
        food.sliceArray(1..(food.count() - 1)).forEachIndexed { index, foodCount ->
            repeat(foodCount / 2) { tempFoodList.add(index + 1) }
        }
        
        return tempFoodList.joinToString("") + "0" + tempFoodList.reversed().joinToString("")
    }
}