public class App {
    public static void main(String[] args) throws Exception {
        printDayOfWeek(7);
    }
    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch(day) {
            case 0 -> { yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " is " + dayOfTheWeek);
    }
}
