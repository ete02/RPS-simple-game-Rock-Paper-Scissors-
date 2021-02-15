package com.kodilla.rps;


import com.kodilla.rps.moves.MoveRPS;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;

public class RpsGame {
    private boolean userWin = false;
    private User user;
    private Computer computer;

    public RpsGame(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public void start() {
        int numberOfWins = RpsRunner.getGameCount();
        while (computer.getScore() < numberOfWins && user.getScore() < numberOfWins) {
            int userMove = user.getMove();
            int computerMove = computer.getMove();
            compareMoveAndAddScore(userMove, computerMove);
            RpsRunner.printMove(userMove, computerMove, getRoundResult(userMove, computerMove));
        }
    }

    private int getRoundResult(int userMove, int computerMove) {
        if (userMove == computerMove) {
            return 0;
        } else if (userWin[userMove - 1][computerMove - 1]) {
            return 1;
        } else {
            return 2;
        }
    }

    private void compareMoveAndAddScore(int userMove, int computerMove) {
        if (userMove == computerMove) {
            RpsRunner.sameMove();
            return;
        }
        if (userWin[userMove - 1][computerMove - 1]) {
            user.addScore();
        } else {
            computer.addScore();
        }
    }
}

