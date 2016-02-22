class LinkedListIterator<T>(start: Node<T>) : MutableListIterator<T> {
    var current: Node<T> = start

    override fun add(element: T) {
        throw UnsupportedOperationException()
    }

    override fun remove() {
        if (current.prev != null) {
            (current.prev as Node<T>).next = current.next
        }
        if (current.next == null) {
            current = current.prev as Node<T>
        } else {
            (current.next as Node<T>).prev = current.prev
            current = current.next as Node<T>

        }

    }

    override fun set(element: T) {
        current.value = element
    }

    override fun hasNext(): Boolean {
        return current.next != null
    }

    override fun hasPrevious(): Boolean {
        return current.prev != null
    }

    override fun next(): T {
        current = current.next!!
        return current.value
    }

    override fun nextIndex(): Int {
        throw UnsupportedOperationException()
    }

    override fun previous(): T {
        if (current.prev == null) {
            throw Throwable()
        }
        current = current.prev as Node<T>
        return current.value
    }

    override fun previousIndex(): Int {
        throw UnsupportedOperationException()
    }
}