package com.kodilla.rps.moves;

public class Paper implements MoveRPS {
    private static Paper paperInstance = null;

    private Paper() {
    }

    public static Paper getInstance() {
        if (paperInstance == null) {
            paperInstance = new Paper();
        }
        return paperInstance;
    }
}
