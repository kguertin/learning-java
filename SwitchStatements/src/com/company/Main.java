package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 3;

	    switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3 or 4 or 5");
                System.out.println("Actually is was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

    }
}
