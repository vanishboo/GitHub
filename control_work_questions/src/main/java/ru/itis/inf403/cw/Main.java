package ru.itis.inf403.cw;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Questions questions = new Questions();
        String fileName = "questions";
        String raitingFile = "raiting";
        Scanner sc = new Scanner(System.in);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(questions);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Game> raiting = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(raitingFile))) {
            raiting = (List<Game>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Файл рейтинга не найден");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Questions questions1 = (Questions) ois.readObject();

            //Игрок
            System.out.println("Введите свое имя");
            String name = sc.nextLine();
            Game gamePlayer = new Game();
            gamePlayer.gamer = name;
            gamePlayer.gameDate = new Date();

            // Вопрос 1
            System.out.println("Вопрос 1: " + questions1.question1);
            for (int i = 0; i < questions1.response1.length; i++) {
                System.out.println((i+1) + ". " + questions1.response1[i]);
            }
            int choice = sc.nextInt();
            if (choice == questions1.goodResponseIndex1 + 1) {
                gamePlayer.raiting++;
            }

            // Вопрос 2
            System.out.println("Вопрос 2: " + questions1.question2);
            for (int i = 0; i < questions1.response2.length; i++) {
                System.out.println((i+1) + ". " + questions1.response2[i]);
            }
            choice = sc.nextInt();
            if (choice == questions1.goodResponseIndex2 + 1) {
                gamePlayer.raiting++;
            }

            // Вопрос 3
            System.out.println("Вопрос 3: " + questions1.question3);
            for (int i = 0; i < questions1.response3.length; i++) {
                System.out.println((i+1) + ". " + questions1.response3[i]);
            }
            choice = sc.nextInt();
            if (choice == questions1.goodResponseIndex3 + 1) {
                gamePlayer.raiting++;
            }
            System.out.println("Игра завершена ваше результат: " + gamePlayer.raiting + "/3");



            raiting.add(gamePlayer);
            Collections.sort(raiting, new Comparator<Game>() {
                @Override
                public int compare(Game o1, Game o2) {
                    return o2.raiting.compareTo(o1.raiting);
                }
            });


            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(raitingFile))) {
                oos.writeObject(raiting);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println();
            System.out.println("История игры: ");
            int i = 1;
            for (Game player : raiting) {
                System.out.println(i++ + ". " + player.gamer + ": " + player.raiting + "/3" + " дата(" + player.gameDate + ")");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
