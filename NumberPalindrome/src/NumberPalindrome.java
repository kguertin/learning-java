public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;
        while(num != 0){
            int lastNumber = num % 10;
            reverse *= 10;
            reverse += lastNumber;
            num /= 10;
        }

        return number == reverse;
    }
}
