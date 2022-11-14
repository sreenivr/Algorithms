package RemoveDupLinkedList.java;

import java.util.HashSet;

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

    void removeDup() {
        HashSet<T> set = new HashSet<T>();

        Node<T> n = head;
        Node<T> prev = null;
        while(n != null) {
            if(set.contains(n.data)){
                // remove the node
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = n;
            }            
            n = n.next;
        }
    }
}
