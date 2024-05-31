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

    fun solution2(ingredient: IntArray): Int {
        var answer: Int = 0

        var stack = Stack<Int>()

        ingredient.map { value ->
            stack.add(value)

            if (stack.size >= 4 && stack.peek() == 1) {
                val first = stack[stack.size - 4] == 1
                val second = stack[stack.size - 3] == 2
                val third = stack[stack.size - 2] == 3
                val fourth = stack[stack.size - 1] == 1

                if (first && second && third && fourth) {
                    repeat(4) { stack.pop() }
                    answer ++
                }

            }

        }

        return answer
    }
}