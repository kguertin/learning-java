package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = "  + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " +myDoubleValue);

        double totalPounds = 16d;
        double totalKg = 7.25d;
        double poundInKg = 0.45359237d;
        double getPoundsInKg = totalPounds * poundInKg;
        double getKgInPounds = totalKg / poundInKg;
        System.out.println(getPoundsInKg);
        System.out.println(getKgInPounds);

    }
}
