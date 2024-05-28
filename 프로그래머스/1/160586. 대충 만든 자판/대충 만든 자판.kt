class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val keyCountMap = mutableMapOf<Char, Int>()

        keymap.forEach { key ->
            key.forEachIndexed { index, char ->
                keyCountMap[char] = minOf(index + 1, keyCountMap[char] ?: Int.MAX_VALUE)
            }
        }

        targets.forEach { target ->
            var keyCount = 0

            run charCountCheck@ {
                target.forEach { char ->
                    keyCountMap[char]?.let { keyCount += it }
                        ?: run {
                            keyCount = -1
                            return@charCountCheck
                        }
                }
            }

            answer += keyCount
        }

        return answer
    }
}