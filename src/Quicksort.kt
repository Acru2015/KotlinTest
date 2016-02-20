fun main(args: Array<String>) {
    val toSort = arrayOf(1, 6, 8, 3, 4, 2, 1, 5)
    print(quicksort(toSort).joinToString())
}

fun List<Int>.toLinkedList(): LinkedList<Int> {
    val temp = LinkedList<Int>()
    temp.addAll(this)
    return temp
}

fun quicksort(toSort: Array<Int>): LinkedList<Int> {
    val pivot = toSort[toSort.size / 2]
    var smaller = toSort.filter { it < pivot }
    var bigger = toSort.filter { it > pivot }
    val smallerMutableList: LinkedList<Int> = smaller.toLinkedList();
    return smallerMutableList
}

//TODO: implement LinkedList as MutableList