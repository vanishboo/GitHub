package ru.itis.inf403.lab10.model;

public class Turtle extends Entity {
    protected int finishX;
    protected int finishY;

    public Turtle() {}

    public Turtle(int x, int y, int finishX, int finishY) {
        super("Черепашка", x, y);
        this.finishX  = finishX;
        this.finishY  = finishY;
    }

    @Override
    public void move() {
        cnt++;
        if (Math.random() > 0.996) {
            if (x < finishX) {
                x++;
            } else if (x > finishX) {
                x--;
            } else if (y < finishY) {
                y++;
            } else if (y > finishY) {
                y--;
            }
        }
    }

}
