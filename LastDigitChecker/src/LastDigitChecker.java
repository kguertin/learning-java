public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (isValid(num1) && isValid(num1) && isValid(num1)) {
            int lastDigitOne = num1 % 10;
            int lastDigitTwo = num2 % 10;
            int lastDigitThree = num3 % 10;

            if(lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
}
