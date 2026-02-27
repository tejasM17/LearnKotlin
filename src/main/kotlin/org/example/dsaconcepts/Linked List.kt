package org.example.dsaconcepts

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null

    // Insert at begening

    fun inserAtBegin(data: Int) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    fun insertAtEnd(data: Int) {
        val newnode = Node(data)

        if (head == null) {
            head = newnode
        }

        var temp = head

        while (temp?.next != null) {
            temp = temp.next
        }

        temp?.next = newnode
    }

    //traversal

    fun printList() {
        var tem = head

        while (tem != null) {
            println("${tem.data} ->")
            tem = tem.next
        }
        println("null")
    }

    fun search(key: Int): Boolean {
        var temp = head

        while (temp != null) {
            if (temp.data == key) return true
            temp = temp.next
        }
        return false
    }

    fun revers() {
        var prev: Node? = null
        var current = head

        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
    }

    fun findMiddel(): Int? {
        var fast = head
        var slow = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow?.data
    }
}



fun main() {
//    val insertNode =
}


