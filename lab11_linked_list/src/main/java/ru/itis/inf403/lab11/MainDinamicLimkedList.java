package ru.itis.inf403.lab11;

import java.util.Random;

import static ru.itis.inf403.lab11.ServiceNode.*;

public class MainDinamicLimkedList {
    public static void main(String[] args) {
        Node first = new Node(5);

        for (int i = 0; i < 29; i++) {
            Random random = new Random();
            add(first, random.nextInt(100));
        }
//        Task1
        System.out.println(findN(first, 17).value);

//        Task2
        printList(first);
        System.out.println();

//        Task3
        first = reverse(first);
        printList(first);
    }
}
