fun main(args: Array<String>) {
    val toSort = intArrayOf(1, 6, 8, 3, 4, 2, 1, 5)
    print(quicksort(toSort).joinToString())
}

fun quicksort(toSort: IntArray): IntArray {
    val pivot = toSort[toSort.size / 2]
    var smaller = toSort.filter { it < pivot }
    var bigger = toSort.filter { it > pivot }
    val smallerList = arrayListOf(smaller)
    return smaller.toIntArray()
}

class LinkedList

//TODO: mplement LinkedList, concat