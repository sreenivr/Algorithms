package KthToLastList.java;

public class Application {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Add items to Linked list
        list.add(new Node<Integer>(0));
        list.add(new Node<Integer>(1));
        list.add(new Node<Integer>(2));
        list.add(new Node<Integer>(3));
        list.add(new Node<Integer>(4));
        list.add(new Node<Integer>(5));
        list.add(new Node<Integer>(6));


        // Print
        System.out.println("Linked list : ");
        list.print();

        // Print kth element
        list.kthToLast(1);        
    }
}
