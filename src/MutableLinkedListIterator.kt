class MutableLinkedListIterator<E>(start: Node<E>) : MutableListIterator<E> {
    var current = start

    override fun add(element: E) {
        var toAdd = Node(element)

        toAdd.prev = current
        current.next = toAdd

        if (current.next != null) {
            toAdd.next = current.next
            (current.next as Node<E>).prev = toAdd
        }
    }

    override fun remove() {
        if (current.next != null && current.prev != null)
    }

    override fun set(element: E) {
        current.value = element
    }

    override fun hasNext(): Boolean {
        return current.next != null
    }

    override fun hasPrevious(): Boolean {
        return current.prev != null
    }

    override fun next(): E {
        if (current.next != null) {
            current = current.next
            return current.value
        }
    }

    override fun nextIndex(): Int {
        throw UnsupportedOperationException()
    }

    override fun previous(): E {
        if (current.prev == null) {
            throw Throwable()
        }
        current = current.prev as Node<E>
        return current.value
    }

    override fun previousIndex(): Int {
        throw UnsupportedOperationException()
    }
}