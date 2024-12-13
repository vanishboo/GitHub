package ru.itis.inf403.lab10.model;

public class Grasshoper extends Entity {
    public Grasshoper() {}

    public Grasshoper(int x, int y) {
        super("Кузнечик", x, y);
    }
    @Override
    public void move() {
        cnt++;
        int direction = (int) (Math.random() * 4);
        switch (direction) {
            case 0:
                if (y > 0) {
                    y-=2;
                }
                break;
            case 1:
                if (x < fieldWidth) {
                    x+=2;
                }
                break;
            case 2:
                if (y < fieldHeigth) {
                    y+=2;
                }
                break;
            case 3:
                if (x > 0) {
                    x-=2;
                }
                break;
        }
    }
}
