class MutableLinkedList<E> : MutableList<E>, Deque<E>, Cloneable {
    override var size = 0
    var head: Node<E>? = null
    var tail: Node<E>? = null
    var dirty = false


    override fun add(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun add(index: Int, element: E) {
        throw UnsupportedOperationException()
    }

    override fun addAll(index: Int, elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun addAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun clear() {
        throw UnsupportedOperationException()
    }

    override fun listIterator(): MutableListIterator<E> {
        throw UnsupportedOperationException()
    }

    override fun listIterator(index: Int): MutableListIterator<E> {
        throw UnsupportedOperationException()
    }

    override fun remove(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeAt(index: Int): E {
        throw UnsupportedOperationException()
    }

    override fun retainAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun set(index: Int, element: E): E {
        throw UnsupportedOperationException()
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<E> {
        throw UnsupportedOperationException()
    }

    override fun element(): E {
        throw UnsupportedOperationException()
    }

    override fun offer(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun peek(): E {
        throw UnsupportedOperationException()
    }

    override fun poll(): E {
        throw UnsupportedOperationException()
    }

    override fun remove(): E {
        throw UnsupportedOperationException()
    }

    override fun contains(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun containsAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun get(index: Int): E {
        throw UnsupportedOperationException()
    }

    override fun indexOf(element: E): Int {
        throw UnsupportedOperationException()
    }

    override fun isEmpty(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun lastIndexOf(element: E): Int {
        throw UnsupportedOperationException()
    }

    override fun iterator(): MutableIterator<E> {
        throw UnsupportedOperationException()
    }

    override fun addFirst(element: E) {
        throw UnsupportedOperationException()
    }

    override fun addLast(element: E) {
        throw UnsupportedOperationException()
    }

    override fun descendingIterator(): Iterator<E> {
        throw UnsupportedOperationException()
    }

    override fun getFirst(): E {
        throw UnsupportedOperationException()
    }

    override fun getLast(): E {
        throw UnsupportedOperationException()
    }

    override fun offerFirst(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun offerLast(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun peekFirst(): E {
        throw UnsupportedOperationException()
    }

    override fun peekLast(): E {
        throw UnsupportedOperationException()
    }

    override fun pollFirst(): E {
        throw UnsupportedOperationException()
    }

    override fun pollLast(): E {
        throw UnsupportedOperationException()
    }

    override fun pop(): E {
        throw UnsupportedOperationException()
    }

    override fun push(element: E) {
        throw UnsupportedOperationException()
    }

    override fun removeFirst(): E {
        throw UnsupportedOperationException()
    }

    override fun removeFirstOccurrence(obj: Any): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeLast(): E {
        throw UnsupportedOperationException()
    }

    override fun removeLastOccurrence(obj: Any): Boolean {
        throw UnsupportedOperationException()
    }
}