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


    }
}
