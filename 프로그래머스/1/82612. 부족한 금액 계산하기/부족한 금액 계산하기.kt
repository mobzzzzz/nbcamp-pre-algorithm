class Solution {
    fun solution(price: Int, money: Int, count: Int): Long = ((1..count).sumOf { price.toLong() * it } - money).coerceAtLeast(0)

    fun solution2(price: Int, money: Int, count: Int): Long = ((1..count).fold(0L) { total, num -> price.toLong() * num + total } - money).coerceAtLeast(0)

    fun solution3(price: Int, money: Int, count: Int): Long = (1..count).sumOf { price.toLong() * it }.let { if (money > it) 0 else it - money }
}