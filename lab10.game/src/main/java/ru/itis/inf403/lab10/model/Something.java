package ru.itis.inf403.lab10.model;

public class Something extends Entity {
    public Something() {}

    public Something(int x, int y) {
        super("Нечто", x, y);
    }
    @Override
    public void move() {
        cnt++;
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 0) {
                    y-= (int) (Math.random()*5);
                }
                break;
            case 1:
                if (x < fieldWidth) {
                    x+= (int) (Math.random()*5);
                }
                break;
            case 2:
                if (y < fieldHeigth) {
                    y+= (int) (Math.random()*5);
                }
                break;
            case 3:
                if (x > 0) {
                    x-= (int) (Math.random()*5);
                }
                break;
        }
    }
}
