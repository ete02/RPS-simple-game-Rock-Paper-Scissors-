package com.kodilla.rps.players;

import com.kodilla.rps.RpsRunner;

public class User implements Player {


    private int score;

    @Override
    public int getMove() {
        return RpsRunner.getMove();
    }

    @Override
    public Integer getScore() {
        return score;
    }

    @Override
    public void addScore() {
        this.score++;
    }
}