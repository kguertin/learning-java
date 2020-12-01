package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 6;
        while (count != 6) {
            System.out.println("Count Value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }

        // If you need your code to run at least once
        count = 6;
        do {
            System.out.println("Count Value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finish = 20;
        int evenSum = 0;
        int totalNums = 0;

        while(number <= finish){
            number++;
            if(!isEvenNumber(number)){
                continue; // Goes back to start of the loop, just allows the code to continue (next iteration of the loop).
            }

            System.out.println("Even Number " + number);
            totalNums++;
            evenSum += number;

            if(totalNums == 5){
                System.out.println(evenSum);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
