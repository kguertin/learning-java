package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 13));
        System.out.println(calcFeetAndInchesToCentimeters(69));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        int totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches <= 0) {
            return -1;
        }
        int calcFeet = inches / 12;
        int  calcInches = inches % 12;

        double CMs = calcFeetAndInchesToCentimeters(calcFeet, calcInches);
        return CMs;
    }
}
