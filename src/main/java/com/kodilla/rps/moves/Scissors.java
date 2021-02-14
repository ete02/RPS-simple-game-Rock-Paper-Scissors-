package com.kodilla.rps.moves;

public class Scissors implements MoveRPS {
    private static Scissors scissorsInstance = null;

    private Scissors() {
    }

    public static Scissors getInstance() {
        if (scissorsInstance == null) {
            scissorsInstance = new Scissors();
        }
        return scissorsInstance;
    }
}
