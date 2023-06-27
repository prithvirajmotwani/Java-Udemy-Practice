public class App {
    public static void main(String[] args) throws Exception {
        int primeNumbers = 0;
        for (int i =10; i < 50 ; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is the prime number");
                primeNumbers++;
            }
            if ( primeNumbers == 3) {
                break;
            }
        }
    }
    public static boolean isPrime(int number) {
        if(number <=2) {
            return number == 2;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
