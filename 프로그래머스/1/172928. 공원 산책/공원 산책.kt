class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var dogPoint = 0 to 0
        var objectPointList = mutableListOf<Pair<Int, Int>>()
        val width = park[0].length
        val height = park.size

        park.forEachIndexed { y, row ->
            row.forEachIndexed { x, char ->
                if (char == 'S') {
                    dogPoint = y to x
                }

                if (char == 'X') {
                    objectPointList.add(y to x)
                }
            }
        }

        routes.forEach routeForEach@ { route ->
            val direction = route.split(" ")[0]
            val distance = route.split(" ")[1].toInt()
            var calculatedPoint = 0 to 0

            when (direction) {
                "N" -> calculatedPoint = dogPoint.first - distance to dogPoint.second
                "S" -> calculatedPoint = dogPoint.first + distance to dogPoint.second
                "W" -> calculatedPoint = dogPoint.first to dogPoint.second - distance
                "E" -> calculatedPoint = dogPoint.first to dogPoint.second + distance
            }

            if (calculatedPoint.second < 0 || calculatedPoint.second >= width || calculatedPoint.first < 0 || calculatedPoint.first >= height) {
                return@routeForEach
            }

            val minX = minOf(dogPoint.second, calculatedPoint.second)
            val maxX = maxOf(dogPoint.second, calculatedPoint.second)
            val minY = minOf(dogPoint.first, calculatedPoint.first)
            val maxY = maxOf(dogPoint.first, calculatedPoint.first)

            objectPointList.forEach { objectPoint ->
                if (objectPoint.second == dogPoint.second && objectPoint.first in minY .. maxY ||
                    objectPoint.first == dogPoint.first && objectPoint.second in minX .. maxX) {
                    return@routeForEach
                }
            }

            dogPoint = calculatedPoint
        }

        return intArrayOf(dogPoint.first, dogPoint.second)
    }
}