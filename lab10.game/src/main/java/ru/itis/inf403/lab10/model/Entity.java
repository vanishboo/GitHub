package ru.itis.inf403.lab10.model;

public class Entity {
    protected String name;
    protected int x;
    protected int y;
    protected static int fieldWidth;
    protected static int fieldHeigth;
    protected int cnt = 0;

    public Entity() {}

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }


    public void move() {
        cnt++;
    }

    public String toString() {
        return name + " (" + x + " " + y + ") сделано шагов: " + cnt;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void setFieldSize(int width, int heigth) {
        fieldWidth =  width;
        fieldHeigth = heigth;

    }
}
