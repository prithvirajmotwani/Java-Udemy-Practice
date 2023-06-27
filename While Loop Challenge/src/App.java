public class App {
    public static void main(String[] args) throws Exception {
        int range = 5;
        while (range++ <= 20) {
            if (isEven(range)) {
                System.out.println(range);
            }
        }
    }
    public static boolean isEven(int number) {
        if ( number % 2 == 0 ) {
            return true;
        }
        else return false;
    }

}
