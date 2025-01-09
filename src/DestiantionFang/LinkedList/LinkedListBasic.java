package DestiantionFang.LinkedList;


import java.util.Arrays;
import java.util.List;

class Node {
    int data;//data value
    Node next; //reference to the next Node in the linked list

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null; //initialize next as null since its end of the list
    }
}

public class LinkedListBasic {

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    //function to insert a new node of the linked list
    public static Node insertHead(Node head, int data) {
        Node newNode = new Node(data, head);
        return newNode;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        //traverse list until the second to last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        return head;
    }


    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        System.out.println("Inserting at the head of the linked list");
        head = insertHead(head, val);

        // Printing the linked list
        printLL(head);

        // Delete the tail of the linked list
        System.out.println("Deleting the last Node");
        head = deleteTail(head);
        printLL(head);
    }
}
