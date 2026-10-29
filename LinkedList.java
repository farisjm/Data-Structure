import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head;

    void createList() {
        Node newNode1 = new Node(10);
        Node newNode2 = new Node(20);
        Node newNode3 = new Node(30);
        Node newNode4 = new Node(40);
        Node newNode5 = new Node(50);

        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;

        head = newNode1;
    }

    void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        list.createList();

        System.out.println("Original List:");
        list.display();

        System.out.print("Enter data to insert: ");
        int data = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        list.insertAtPosition(data, position);

        System.out.println("After insertion:");
        list.display();

        sc.close();
    }
}