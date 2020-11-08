package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);
        int prevResult = result;
        System.out.println("Previous Result = " + result);
        result= result - 1; // 3 - 1 = 2
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("its is not an alien");
            System.out.println("And I am scared of aliens");
        }
        
        isAlien = true;
        if(isAlien == false)
            System.out.println("still not an alien");

        int topScore = 80;
        if(topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an not Error");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("It was a car");
        }

        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double total = (doubleOne + doubleTwo) * 100.00d;
        double remainder = total % 40.00d;
        boolean isNoRemainder = remainder == 0 ? true : false;

        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }


    }
}
