package ru.itis.inf403.lab12.homework;

public class List2Direction {

    private Node first;

    public void add(Apple value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
            current.next.prev = current;
        }
    }

    public boolean add(int position, Apple value) {
        Node pos = first;
        for (int i = 1; i < position; i++) {
            pos = pos.next;
        }
//        return false
        Node b  = pos;
        Node a = new Node(value);
        a.prev = b.prev;
        a.next = b;
        a.prev.next = a;
        b.prev = a;
        return true;
    }

    public void sort() {
        for (Node  i = first; i.next != null; i = i.next ) {
            for (Node  j = first; j.next != null; j = j.next ) {
                if (j.value.compare(j.next.value) > 0) {
                    Apple a = j.value;
                    j.value = j.next.value;
                    j.next.value = a;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }

    public Node pop() {
        Node cnt = first;
        while (cnt.next != null) {
            cnt = cnt.next;
        }
        cnt.prev.next = null;
        return cnt;

    }

    public Apple remove(int index) {
        Node cnt  = first;
        for (int i = 0; i < index-1; i++) {
            cnt = cnt.next;
        }
        cnt.prev.next = cnt.next;
        cnt.next.prev = cnt.prev;
        return cnt.value;
    }

    public void printReverse() {
        Node cnt = first;
        while (cnt.next != null) {
            cnt = cnt.next;
        }
        while (cnt != null) {
            System.out.println(cnt.value);
            cnt = cnt.prev;
        }
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + "\n");
            current = current.next;
        }
        System.out.println();
    }


}
