import java.util.Scanner;

public class singleLinkedList {
    // defining structure
    public class Node {
        int data;
        Node next; // pointer containing address of next node
        // constructor

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // containing address of first node

    // creating linked list
    public void create() {
        int data, newdata;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter data:=> ");
                data = sc.nextInt();
                Node new_node = new Node(data); // calling the constructor
                // checking if the linkedlist exist or not
                if (head == null) {
                    head = new_node;
                } else { // inserting node at beginning
                    new_node.next = head;
                    head = new_node;
                }
                System.out.print("add more nodes? press: 1 => ");
                newdata = sc.nextInt();
            } // end do
            while (newdata == 1);
        } // end try
    }// end create

    // traverse/ reading data
    public void traverse() {
        Node temp = head; // temp has the address of first node
        // checking if LL exist
        if (head == null) {
            System.out.println("LinkedList not exist!");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }// end traverse

    // driver class
    public static void main(String[] args) {
        singleLinkedList ll = new singleLinkedList();
        System.out.println("singly linked list is created successfully. ");
        ll.create();
        System.out.println("Existing nodes are: =>");
        ll.traverse();
    }// end main
}// end singleLinkedList