public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigits(12345));
    }
    public static int sumDigits(int number) {
        if (number < 1) return -1;
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while ( number > 0);
        return sum;
    }
}
