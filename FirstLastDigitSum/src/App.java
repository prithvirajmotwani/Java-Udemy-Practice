public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumFirstAndLastDigit(252));
    }
    public static int sumFirstAndLastDigit(int number) {
        if ( number < 0) { return -1;} 
        if ( number % 10 == number) { return number*2;}
        int sum = 0;
        sum += number%10;

        while ( true) {
            number /= 10;
            if ((number / 10) % 10 == 0) break;
        }
        sum += number;
        return sum;
    }
}
