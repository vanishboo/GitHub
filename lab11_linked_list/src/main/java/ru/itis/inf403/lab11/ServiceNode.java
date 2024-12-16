package ru.itis.inf403.lab11;

public class ServiceNode {
    public static Node findLast(Node first) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);
        last.next = newElement;
    }

    public static Node findN(Node first, int n) {
        Node current = first;
        for (int i = 0; i < n-1; i++) {
            current = current.next;
        }
        return current;
    }

    public static void printList(Node first) {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static Node reverse(Node first) {
        Node prev = null;
        Node cnt = first;
        Node next = null;
        while (cnt != null) {
            next = cnt.next;
            cnt.next = prev;
            prev = cnt;
            cnt = next;
        }
        return prev;

    }
}
