package ru.itis.inf403.lab2_08.labirint;

import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;

public class Labirint {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("labirint_save");
        int[][] lab = {
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 1}
        };

        String[][] lab2 = {
                {"1", "1", "1", "1", "1", "1", "1"},
                {"1", " ", " ", " ", " ", " ", "1"},
                {"1", " ", " ", " ", " ", " ", "1"},
                {"1", " ", " ", " ", " ", " ", "1"},
                {"1", " ", " ", " ", " ", " ", "1"},
                {"1", " ", " ", " ", " ", " ", "1"},
                {"1", "1", "1", "1", "1", "1", "1"}
        };

        boolean flag = true;
        boolean newGame = false;
        int steps = 0;
        int playerX = 0;
        int playerY = 3;
        lab2[playerX][playerY] = "X";
        System.out.println("Привет! Это игра Лабиринт, Игрок обозначается значком Х,");
        System.out.println("стена это 1. Для перемещения по полю используй команды:");
        System.out.println("w = вперед s = вниз, a = влево, d = вправо");
        try (
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis))
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            System.out.println("1. Новая игра");
            System.out.println("2. Загрузить игру");
            String choose = sc.next();
            if (choose.equals("2")) {
                Object[] loadData = (Object[]) ois.readObject();
                lab2 = (String[][]) loadData[0];
                playerX = (int) loadData[1];
                playerY = (int) loadData[2];
                steps = (int) loadData[3];
                newGame = true;
            } else if (choose.equals("1")) {
                newGame = true;
            }
            if (newGame) {
                while (flag) {
                    System.out.println("1. Сохранить игру");
                    System.out.println("2. Выход");
                    //отрисовка поля
                    for (int i = 0; i < lab2.length; i++) {
                        for (int j = 0; j < lab2[i].length; j++) {
                            System.out.print(lab2[i][j] + " ");
                        }
                        System.out.println();
                    }

                    String choice = sc.next();
                    int newX = playerX;
                    int newY = playerY;

                    switch (choice) {
                        case "w" -> newX = playerX - 1;                                           // команды
                        case "s" -> newX = playerX + 1;
                        case "a" -> newY = playerY - 1;
                        case "d" -> newY = playerY + 1;
                        case "1" -> {
                            try (FileOutputStream fos = new FileOutputStream(file);
                                 ObjectOutputStream oos = new ObjectOutputStream(fos)){
                                oos.writeObject(new Object[]{lab2, playerX, playerY, steps});
                            }
                        }
                        case "2" -> flag = false;
                        default -> {
                            System.out.println("Неверный ввод");
                            continue;
                        }
                    }
                    steps++;

                    if (newX >= 0 && newX < lab.length && newY >= 0 && newY < lab[0].length) {      //границы и стены
                        if (lab[newX][newY] == 0) {
                            lab2[playerX][playerY] = ".";
                            playerX = newX;
                            playerY = newY;
                            lab2[playerX][playerY] = "X";
                        } else {
                            lab2[newX][newY] = "1";
                            System.out.println("Стена");
                        }
                    } else {
                        System.out.println("Нельзя выйти за границы");
                    }
                    if (playerX == 6 && playerY == 5) {
                        System.out.println("Лабиринт пройден за " + steps + " шагов");
                        flag = false;
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
