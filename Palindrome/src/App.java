public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(-11122121));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverse = 0;
        int remainingNumber = number;
        do {
            reverse *= 10; 
            reverse += remainingNumber % 10; 
            remainingNumber /= 10;
        } while ( remainingNumber > 0);
        
        if ( number == reverse) return true;
        return false;
    }

}
