package ru.itis.inf403.lab10;

import ru.itis.inf403.lab10.model.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeigth = 1000;
        int finishFieldWidth = 10;
        int finishFieldHeigth = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[4];
        Random random = new Random();
        entities[0] = new Ant(random.nextInt(fieldWidth), random.nextInt(fieldHeigth));
        entities[1] = new Turtle(random.nextInt(fieldWidth), random.nextInt(fieldHeigth), finishX, finishY);
        entities[2] = new Grasshoper(random.nextInt(fieldWidth), random.nextInt(fieldHeigth));
        entities[3] = new Something(random.nextInt(fieldWidth), random.nextInt(fieldHeigth));
        Entity.setFieldSize(fieldWidth, fieldHeigth);

        Game game = new Game(fieldWidth, fieldHeigth, finishFieldWidth, finishFieldHeigth,
                 finishX, finishY, entities);
        Entity champion = game.start();
    }
}
