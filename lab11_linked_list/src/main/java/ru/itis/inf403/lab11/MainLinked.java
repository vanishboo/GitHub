package ru.itis.inf403.lab11;

public class MainLinked {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(7);

        first.next = second;
        System.out.println(first.next.value);

        Node third = new Node(10);
        second.next = third;
        add(first, 15);

        System.out.println(findLast(first).value);
    }

//    Добавление нового элемента
//    1. Ищем последний
//    2. Создаем новый
//    3. В последнем устанавливаем ссылку на новый
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
}
