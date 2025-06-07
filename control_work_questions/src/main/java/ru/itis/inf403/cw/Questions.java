package ru.itis.inf403.cw;

import java.io.Serializable;

public class Questions implements Serializable {

    String question1;
    String[] response1;
    int goodResponseIndex1;

    String question2;
    String[] response2;
    int goodResponseIndex2;

    String question3;
    String[] response3;
    int goodResponseIndex3;

    public Questions() {

        question1 = "Сколько планет в Солнечной системе?";
        response1 = new String[]{"8", "9", "10"};
        goodResponseIndex1 = 0; //8


        question2 = "Какая самая длинная река в мире?";
        response2 = new String[]{"Амазонка", "Нил", "Янцзы"};
        goodResponseIndex2 = 0; // Амазонка


        question3 = "Столица Австралии?";
        response3 = new String[]{"Сидней", "Москва", "Канберра"};
        goodResponseIndex3 = 2; // Канберра
    }
}
