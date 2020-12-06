public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        while(number >= 1){
            int checkNumber = number % 10;
            if(checkNumber % 2 == 0){
                sum += checkNumber;
            }
            number /= 10;
        }
        return sum;
    }
}
