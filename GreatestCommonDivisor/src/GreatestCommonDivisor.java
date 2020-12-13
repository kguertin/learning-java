public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int divisor = 0;
        int commonDivisor = 0;

        while(divisor < first && divisor < second ){
            divisor += 1;
            if(first % divisor == 0 && second % divisor == 0){
                commonDivisor = divisor;
            }
        }

        return commonDivisor;

    }
}
