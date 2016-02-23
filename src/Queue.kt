interface Queue<E> : Collection<E> {
    fun add(element: E): Boolean
    fun element(): E
    fun offer(element: E): Boolean
    fun peek(): E
    fun poll(): E
    fun remove(): E
}