public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int reversedNum = reverse(number);
        int digitCount = getDigitCount(number);

        while(digitCount > 0){
            int num = reversedNum % 10;
            switch(num){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            digitCount--;
            reversedNum /= 10;
        }



    }

    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }

        return reverse;

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        if(number == 0){
            count = 1;
        } else {
            while(number > 0){
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
