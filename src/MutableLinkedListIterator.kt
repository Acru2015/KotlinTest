class MutableLinkedListIterator<E>(start: Node<E>) : MutableListIterator<E> {
    override fun add(element: E) {
        throw UnsupportedOperationException()
    }

    override fun hasNext(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun next(): E {
        throw UnsupportedOperationException()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }

    override fun set(element: E) {
        throw UnsupportedOperationException()
    }

    override fun hasPrevious(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun nextIndex(): Int {
        throw UnsupportedOperationException()
    }

    override fun previous(): E {
        throw UnsupportedOperationException()
    }

    override fun previousIndex(): Int {
        throw UnsupportedOperationException()
    }

}