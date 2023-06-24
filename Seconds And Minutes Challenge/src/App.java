public class App {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(65,415));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds/60;
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }
        else {
            return "OOPS! Time can't be negative ";
        }


    }
    
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds <= 59 && seconds >=0)) {
            seconds = minutes * 60 + seconds;
            int hours = seconds / 3600;
            minutes = (seconds % 3600) / 60;
            seconds = (seconds % 3600) % 60;
            return (hours + "h " + minutes + "m " + seconds + "s");
        }
        else {
            return "Invalid Input";
        }
    }
}
