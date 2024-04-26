class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> = strings.toList().sortedWith( 
        compareBy<String> {
            it[n]
        }.thenBy {
            it
        }
    ).toTypedArray()
}