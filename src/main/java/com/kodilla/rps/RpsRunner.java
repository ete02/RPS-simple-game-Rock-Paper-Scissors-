package com.kodilla.rps;

import java.util.Scanner;

//all comments for my educational purposes
public class RpsRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void startInfo(){
        System.out.println("Welcome to RPS Game");
        System.out.println("Hello " + getUserName() + "!");
        System.out.println("The game controls are as follows:");
        System.out.println("If you want to choose \"Rock\" press \"1\"");
        System.out.println("If you want to choose \"Paper\" press \"2\"");
        System.out.println("If you want to choose \"Scissors\" press \"3\"");
    }

    public static String getUserName() {
        System.out.println("Tell us your name?");
        String userName = scanner.nextLine();
        return userName;
    }

    public static int getGameCount() {
        System.out.println("How many wins would you like to play to?");
        boolean correctChoice = false;
        do { //co znajduje się w jej wnętrzu wykona się przynajmniej raz, ponieważ warunek jest sprawdzany dopiero w drugiej kolejności.
                String number = scanner.next();
            try {
                correctChoice = true;
                return Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid value. Give me a number: ");
                correctChoice = false;
            }
        } while (!correctChoice);
        return 0;
    }

    public static boolean playAgain() {
        System.out.println("Do you want to play again? Yes/No");
        boolean correctChoice = false;
        boolean playAgain = false;
        do {
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("t")) {
                playAgain = true;
                correctChoice = true;
            } else if (userChoice.equalsIgnoreCase("n")) {
                playAgain = false;
                correctChoice = true;
            } else {
                correctChoice = false;
                System.out.println("Niewłaściwy wybór. Czy chcesz zagrać jeszcze raz? T/N");
            }
        } while (!correctChoice);
        return playAgain;
    }

    public static void finishGame() {
        System.out.println("Game is finish");
    }

    public static int getMove() {
        System.out.println("Choose your move!");
        boolean correctMove = false;
        do {
            String userMove = scanner.next();
            switch(userMove) {
                case "1" :
                    correctMove = true;
                    return 1;
                case "2" :
                    correctMove = true;
                    return 2;
                case "3" :
                    correctMove = true;
                    return 3;
                default :
                    System.out.println("Invalid movement. Please choose: 1, 2 or 3!");
            }
        } while(!correctMove);
        return -1;
    }

    public static void sameMove() {
        System.out.println("It's a Tie! User and computer choose are the same ");
    }

    public static void finishStatement(int userScore, int computerScore) {
        if(userScore > computerScore) {
            System.out.println("You won! Score: " + userScore + ". Computer score: "
                    + computerScore);
        }
        else {
            System.out.println("You lost, try again. " +
                    "Player score: " + userScore + ". Computer score: " + computerScore);
        }
    }

    public static void printMove(int userMove, int computerMove, int roundResult) {
        String userMoveName = getMoveName(userMove);
        String computerMoveName = getMoveName(computerMove);
        switch (roundResult) {
            case 0:
                break;
            case 1:
                System.out.println(userMoveName + " beats " + computerMoveName + ". You get a point");
                break;
            case 2:
                System.out.println(computerMoveName + " beats " + userMoveName + ". Computer get point");
        }
    }

    public static String getMoveName(int move) {
        switch (move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }
}
