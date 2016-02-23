interface Deque<E> : Queue<E> {
    fun addFirst(element: E)
    fun addLast(element: E)
    fun descendingIterator(): Iterator<E>
    fun getFirst(): E
    fun getLast(): E
    fun offerFirst(element: E): Boolean
    fun offerLast(element: E): Boolean
    fun peekFirst(): E
    fun peekLast(): E
    fun pollFirst(): E
    fun pollLast(): E
    fun pop(): E
    fun push(element: E)
    fun removeFirst(): E
    fun removeFirstOccurrence(obj: Any): Boolean
    fun removeLast(): E
    fun removeLastOccurrence(obj: Any): Boolean
}