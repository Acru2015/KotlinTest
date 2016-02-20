class LinkedList<T>() : MutableList<T> {
    override val size: Int
        get() = throw UnsupportedOperationException()

    var head: Node<T>? = null
    var tail: Node<T>? = null

    override fun add(element: T): Boolean {
        val toAdd: Node<T> = Node(element)
        if (tail != null) {
            (tail as Node<T>).next = toAdd
            toAdd.prev = tail
            tail = toAdd
        } else {
            head = toAdd
            tail = toAdd
        }
        return true
    }

    override fun add(index: Int, element: T) {
        throw UnsupportedOperationException()
    }

    override fun addAll(index: Int, elements: Collection<T>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun addAll(elements: Collection<T>): Boolean {
        if (head == null) {
            //this = elements.toMutableList()
        }
        for (e in elements) {
            this.add(e)
        }
        return true
    }

    override fun clear() {
        head = null
        tail = null
    }

    override fun listIterator(): MutableListIterator<T> {
        if (head != null) {
            return LinkedListIterator(head as Node<T>)
        } else {
            throw Throwable()
        }
    }

    override fun listIterator(index: Int): MutableListIterator<T> {
        throw UnsupportedOperationException()
    }

    override fun remove(element: T): Boolean {
        val iterator: MutableListIterator<T> = listIterator()
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                return true
            }
        }
        return false
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeAt(index: Int): T {
        throw UnsupportedOperationException()
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun set(index: Int, element: T): T {
        throw UnsupportedOperationException()
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
        throw UnsupportedOperationException()
    }

    override fun contains(element: T): Boolean {
        throw UnsupportedOperationException()
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun get(index: Int): T {
        throw UnsupportedOperationException()
    }

    override fun indexOf(element: T): Int {
        throw UnsupportedOperationException()
    }

    override fun isEmpty(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun lastIndexOf(element: T): Int {
        throw UnsupportedOperationException()
    }

    override fun iterator(): MutableIterator<T> {
        throw UnsupportedOperationException()
    }
}