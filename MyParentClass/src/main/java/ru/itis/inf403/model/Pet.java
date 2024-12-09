package ru.itis.inf403.model;

public class Pet {
    protected String name;
    protected int age;
    protected float weight;
    public Pet() {}

    public Pet(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight;
    }

    public void eat() {
        System.out.println(name + ", покушал, теперь его вес " + (weight + 2));
    }
}
