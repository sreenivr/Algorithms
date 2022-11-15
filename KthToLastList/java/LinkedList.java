package KthToLastList.java;

// Implementation of a singly linked list
public class LinkedList<T> {
    Node<T> head = null;
    LinkedList() {
    }

    // Add node to begining
    void add(Node<T> node) {
        node.next = head;
        head = node;
    }

    void print() {
        Node<T> n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

    // Just print the kth element from the last node
    // If k = 0, returns the last element
    int kthToLast(Node<T> h, int k) {
        if(h == null) {
            return 0;
        }

        int index = kthToLast(h.next, k);
        if(index == k) {
            System.out.println("K = " + k + " Kth element = " + h.data);
        }

        index ++;
        return index;
    }

    void kthToLast(int k) {
        this.kthToLast(head, k);
    }
}
