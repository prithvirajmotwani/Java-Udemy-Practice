public class App {
    public static void main(String[] args) throws Exception {
        natoPhoneticAlphabet('A');
    }
    public static void natoPhoneticAlphabet(char character) {
        switch (character) {
            case 'A':
                System.out.println( character + " = Able");       
                break;
            case 'B':
                System.out.println( character + " = Baker");       
                break;
            case 'C':
                System.out.println( character + " = Charlie");       
                break;
            case 'D':
                System.out.println( character + " = Dog");       
                break;
            case 'E':
                System.out.println( character + " = Easy");       
                break;
            default:
                System.out.println(character + "not found");
                break;
        }
    }
}
