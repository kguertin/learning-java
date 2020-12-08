public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2 ){
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }

        int firstNum1 = num1 / 10;
        int firstNum2 = num1 % 10;
        int secondNum1 = num2 / 10;
        int secondNum2 = num2 % 10;

        return (firstNum1 == secondNum1 || firstNum1 == secondNum2 || firstNum2 == secondNum1|| firstNum2 == secondNum2);
    }
}
