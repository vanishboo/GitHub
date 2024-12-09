package ru.itis.inf403.model;

import java.util.Arrays;

public class StreetDog extends Dog {
    private int sizeVolier;
    private String[] activities;
    public StreetDog(String name, int age, float weight, String breed, int sizeVolier, String[] activities) {
        super(name, age, weight, breed);
        this.sizeVolier = sizeVolier;
        this.activities = activities;
    }

    public int getSizeVolier() {
        return sizeVolier;
    }
    public void setSizeVolier(int sizeVolier) {
        this.sizeVolier = sizeVolier;
    }
    public String[] getActivities() {
        return activities;
    }
    public void setActivities(String[] activities) {
        this.activities = activities;
    }
    @Override
    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight + ", размер вольера " + sizeVolier + ", активности " + Arrays.toString(activities);
    }

    public void eat() {
        System.out.println(name + " погрыз кость, вес " + weight);
    }

    public void guard() {
        System.out.println(name + " охраняет дом");
    }


}
