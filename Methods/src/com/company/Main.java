package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 2000);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }

        return -1;
    }
}
