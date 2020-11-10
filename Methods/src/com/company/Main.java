package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highScore);


        highScore = calculateScore(true, 10000, 8, 2000);
        System.out.println("Your final score is " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tom", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Ann", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Mark", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Bort", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Sally", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition (String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
}
