package ru.itis.inf403.model;

public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, float weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight + ", цвет " + color;
    }
    public void eat() {
        System.out.println(name + " покушал и пошел спать, его вес " + (weight + 1));
    }

    public void porvatDivan() {
        System.out.println(name + " порвал ваш диван");
    }
}
