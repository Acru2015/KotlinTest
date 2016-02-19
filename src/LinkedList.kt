class LinkedList<T>(override val size: Int) : MutableList<T> {
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

    fun join(linkedList: LinkedList<T>) {
        if (tail != null && linkedList.head != null) {
            (tail as Node<T>).next = linkedList.head
            (linkedList.head as Node<T>).prev = tail
        } else if (tail == null && linkedList.head != null) {
            head = linkedList.head
            tail = linkedList.tail
        }
    }
}