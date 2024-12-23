package ru.itis.inf403.lab12.homework;

public class Main {
    public static void main(String[] args) {

        List2Direction list2 = new List2Direction();

        list2.add(new Apple("Красный", 55, "Антоновка", 120));
        list2.add(new Apple("Зеленый", 60, "Грени", 100));
        list2.add(new Apple("Желтый", 80, "Голден", 130));
        list2.add(new Apple("Алый", 75, "Гала", 150));
        list2.add(new Apple("Сливовый", 70, "Спартан", 90));
        list2.add(new Apple("Красно-белый", 65, "Башкирская красавица", 110));

        System.out.println("----------------------------------------------");
        System.out.println("Изначальный список");
        System.out.println("----------------------------------------------");

        list2.print();
        System.out.println("----------------------------------------------");
        System.out.println("Check add");
        System.out.println("----------------------------------------------");
        list2.add(5, new Apple("Зеленый", 64, "Семеринская", 125));
        list2.print();


        System.out.println("----------------------------------------------");
        System.out.println("Check pop");
        System.out.println("----------------------------------------------");
        System.out.println("Deleted " + list2.pop().value);
        System.out.println("----------------------------------------------");
        list2.print();


        System.out.println("----------------------------------------------");
        System.out.println("Check remove");
        System.out.println("----------------------------------------------");
        System.out.println("Removed " + list2.remove(2));
        System.out.println("----------------------------------------------");
        list2.print();
        System.out.println("----------------------------------------------");


        System.out.println("Check printReverse");
        System.out.println("----------------------------------------------");
        list2.printReverse();
        System.out.println("----------------------------------------------");


        System.out.println("Check sort");
        System.out.println("----------------------------------------------");
        list2.sort();
        list2.print();
        System.out.println("----------------------------------------------");

    }
}
