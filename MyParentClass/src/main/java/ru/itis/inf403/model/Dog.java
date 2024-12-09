package ru.itis.inf403.model;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, int age, float weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight + ", порода " + breed;
    }
    public void eat() {
        System.out.println(name + " покушал, вес " + (weight + 2));
    }

    public void bark() {
        System.out.println(name + " громко лает!");
    }
}
