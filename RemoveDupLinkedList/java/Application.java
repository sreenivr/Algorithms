package RemoveDupLinkedList.java;

public class Application {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add items to Linked list
        list.add(new Node<Integer>(0));
        list.add(new Node<Integer>(1));
        list.add(new Node<Integer>(2));
        list.add(new Node<Integer>(1));
        list.add(new Node<Integer>(1));
        list.add(new Node<Integer>(2));
        list.add(new Node<Integer>(2));


        // Print
        list.print();

        // Remove duplicates from the list
        list.removeDup();

        // Print
        list.print();
    }
}
