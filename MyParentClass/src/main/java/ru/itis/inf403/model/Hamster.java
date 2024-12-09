package ru.itis.inf403.model;

public class Hamster extends Pet {
    private float cheekCapacity;

    public Hamster(String name, int age, float weight, float cheekCapacity) {
        super(name, age, weight);
        this.cheekCapacity = cheekCapacity;
    }

    public float getCheekCapacity() {
        return cheekCapacity;
    }

    public void setCheekCapacity(int cheekCapacity) {
        this.cheekCapacity = cheekCapacity;
    }
    @Override
    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight + ", вместимость щек " + cheekCapacity;
    }
    public void eat() {
        System.out.println(name + " набрал орешки за щеки");
    }

    public void runWheel() {
        System.out.println(name + " носится в колесе!");
    }
}
