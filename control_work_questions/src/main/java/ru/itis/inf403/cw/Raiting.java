package ru.itis.inf403.cw;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Raiting {
    List<Game> games;
}

class Game implements Serializable {
    String gamer;
    Integer raiting = 0;
    Date gameDate;

}
