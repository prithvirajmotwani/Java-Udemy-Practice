public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getDaysInMonthK(1, -2018));
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            } 
            else {
                return true;
            }
        } 
        else {
            return false;
        }
    }
    public static int getDaysInMonthK(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        else if (year < 1 || year > 9999) {
            return -1;
        }
        else {
            return switch (month) {
                case 1,3,5,7,8,10,12 -> 31;
                case 2 -> {
                    if (isLeapYear(year)) {
                        yield 29;
                    }
                    else {
                        yield 28;
                    }
                }
                default -> 30;
            };
        }

    }
}
