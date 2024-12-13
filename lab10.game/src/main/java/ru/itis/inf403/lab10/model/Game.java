package ru.itis.inf403.lab10.model;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private int finishFieldWidth;
    private int finishFieldHeigth;
    protected int finishX;
    protected int finishY;
    private Entity[] players;

    public Game() {}

    public Game(int fieldWidth, int fieldHeigth, int finishFieldHeigth,
                int finishFieldWidth, int finishX, int finishY, Entity[] players) {
        this.fieldHeigth = fieldHeigth;
        this.fieldWidth = fieldWidth;
        this.players = players;
        this.finishFieldWidth = finishFieldWidth;
        this.finishFieldHeigth = finishFieldHeigth;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].getX() >= finishX
                        && players[i].getX() <= finishX + finishFieldWidth
                        && players[i].getY() >= finishY
                        && players[i].getY() <= finishY + fieldHeigth) {
                    System.out.println(players[i]);
                        return players[i];
                }
            }
        }
    }
}
