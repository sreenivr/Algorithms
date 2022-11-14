package RemoveDupLinkedList.java;

class Node <T> {
    public T data;
    public Node<T> next = null;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}