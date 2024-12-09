package ru.itis.inf403;

import ru.itis.inf403.model.*;

public class main {
    public static void main(String[] args) {

        Pet pet = new Pet("Григорий", 3, 4);
        System.out.println(pet);
        pet.eat();

        System.out.println();

        Cat cat = new Cat("Рыжик", 1, 2, "Рыжий");
        System.out.println(cat);
        cat.eat();
        cat.porvatDivan();

        System.out.println();

        Dog dog = new Dog("Бобик", 7, 10, "не породистый");
        System.out.println(dog);
        dog.eat();
        dog.bark();

        System.out.println();

        Hamster hamster = new Hamster("Жорик", 1, 0.300f, 0.030f);
        System.out.println(hamster);
        hamster.eat();
        hamster.runWheel();

        System.out.println();

        StreetDog streetDog = new StreetDog("Шарик", 15, 10, "Лайка", 3, new String[]{"Спит", "Ест", "Лает", "Ходит в туалет"});
        System.out.println(streetDog);
        streetDog.eat();
        streetDog.guard();

        System.out.println();

        HomeDog homeDog = new HomeDog("Чарли", 8, 3, "Китайская хохлатая", "Кровать", new String[]{"Спит", "Ест", "Лает", "Ходит в туалет", "Кусается"});
        System.out.println(homeDog);
        homeDog.eat();
        homeDog.play();
    }
}
