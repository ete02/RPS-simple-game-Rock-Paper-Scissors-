package com.kodilla.rps.moves;

public class Rock implements MoveRPS {
    private static Rock rockInstance = null;

    private Rock() {
    }

    public static Rock getInstance() {
        if (rockInstance == null) {
            rockInstance = new Rock();
        }
        return rockInstance;
    }
}
