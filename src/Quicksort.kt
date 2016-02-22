fun main(args: Array<String>) {
    val toSort = intArrayOf(1, 6, 8, 3, 4, 2, 0, 5)
    print(quicksort(toSort).joinToString())
}

fun quicksort(toSort: IntArray): IntArray {
    if (toSort.size < 2) {
        return toSort
    }
    val pivot = toSort[toSort.size / 2]
    var smaller = quicksort(toSort.filter { it < pivot }.toIntArray())
    var bigger = quicksort(toSort.filter { it > pivot }.toIntArray())
    var result = smaller.plus(pivot).plus(bigger)
    return result
}