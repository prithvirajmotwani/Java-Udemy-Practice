public class App {
    public static void main(String[] args) throws Exception {
        System.out.print(sumOdd(100,1000 ));
    }
    public static boolean isOdd(int number) {
        if(number > 0) {
            if(number%2 == 0) {
                return false;
            }
            else return true;
        }
        else {
            return false;
        }
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
         if ( end < start || (start < 0 || end <0)) return -1;
         else {
            for (int i = start; i <= end ; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
         } 
         return sum;
    }
}
