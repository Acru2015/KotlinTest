class MutableLinkedList<E> : MutableList<E>, Deque<E>, Cloneable {
    override var size = 0
    var head: Node<E>? = null
    var tail: Node<E>? = null
    var dirty = false


    override fun add(element: E): Boolean {
        val toAdd = Node(size, element)
        if (head == null && tail != null) {
            head = toAdd
            tail = toAdd
        } else {
            tail!!.next = toAdd
            toAdd.prev = tail
            tail = toAdd
        }
        return true
    }

    override fun add(index: Int, element: E) {
        if (index > size) {
            throw Throwable("Index out of bounds")
        }
        if (dirty) {
            correctIndices()
        }
        val toAdd = Node(index, element)
        var temp = head
        if (temp != null) {
            while (temp.next != null) {
                if (temp.index == index) {
                    toAdd.next = temp.next
                    toAdd.prev = temp
                    temp.next = toAdd
                    dirty = true
                }
            }
        }
    }

    override fun addAll(elements: Collection<E>): Boolean {
        for (e in elements) {
            this.add(e)
        }
        return true
    }

    override fun addAll(index: Int, elements: Collection<E>): Boolean {
        var counter = 0
        for (e in elements) {
            this.add(index + counter, e)
            counter++
        }
        return true
    }

    override fun clear() {
        head = null
        tail = null
        size = 0
    }

    override fun listIterator(): MutableListIterator<E> {
        return iterator()
    }

    override fun listIterator(index: Int): MutableListIterator<E> {
        if (index > size) {
            throw Throwable("Index out of bounds")
        }
        if (dirty) {
            correctIndices()
        }
        var temp = head
        if (temp != null) {
            while (temp.next != null) {
                temp = temp.next
                if (temp.index == index) {
                    return MutableLinkedListIterator(temp)
                }
            }
        }
        throw Throwable("No idea whats wrong")
    }

    override fun remove(element: E): Boolean {
        val iterator = iterator()
        var temp: E;
        while (iterator.hasNext()) {
            temp = iterator.next()
            if (element == temp) {
                iterator.remove()
            }
        }
        throw Throwable("List does not contain the Element")
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        val iterator = iterator()
        var temp: E;
        while (iterator.hasNext()) {
            temp = iterator.next()
            if (temp in elements) {
                iterator.remove()
            }
        }
        throw Throwable("List does not contain the Element")
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

    override fun iterator(): MutableListIterator<E> {
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

    private fun correctIndices() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}