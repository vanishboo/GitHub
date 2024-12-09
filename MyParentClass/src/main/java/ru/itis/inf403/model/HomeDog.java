package ru.itis.inf403.model;

import java.util.Arrays;

public class HomeDog extends Dog {
    private String mestoGdeSpit;
    private String[] activities;
    public HomeDog(String name, int age, float weight, String breed, String mestoGdeSpit, String[] activities) {
        super(name, age, weight, breed);
        this.mestoGdeSpit = mestoGdeSpit;
        this.activities = activities;
    }

    public String getSizeVolier() {
        return mestoGdeSpit;
    }
    public void setSizeVolier(String sizeVolier) {
        this.mestoGdeSpit = sizeVolier;
    }
    public String[] getActivities() {
        return activities;
    }
    public void setActivities(String[] activities) {
        this.activities = activities;
    }
    @Override
    public String toString() {
        return name + " возраст - " + age + ", вес - " + weight + ", место где спит " + mestoGdeSpit + ", активности " + Arrays.toString(activities);
    }
    public void eat() {
        System.out.println(name + " съел котлеты со стола, вес " + (weight+1));
    }

    public void play() {
        System.out.println(name + " играет с игрушками");
    }

}