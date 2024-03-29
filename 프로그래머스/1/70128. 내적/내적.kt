class Solution {
    fun solution(a: IntArray, b: IntArray) = a.zip(b) { first, second -> first * second }.sum()
}