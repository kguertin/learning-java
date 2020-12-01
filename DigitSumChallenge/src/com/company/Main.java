package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in the number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in the number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in the number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }

        return sum;
    }
}