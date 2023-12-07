import java.util.*;
 class Main_Menu {
    //Dicts for what is considered a valid digit, Letter, nonzerodigit
    //x = 1 allowed
    //x = 001 is not allowed
    //can't -0 that isn't valid

    public static void start() {
        System.out.println("Welcome to the toy interpreter.");
        System.out.println("This interpreter will be able to do very basic things.");
        System.out.println("Type in end to stop the interpreter.");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equalsIgnoreCase("end")) {
            Toy_Interpreter userInputs = new Toy_Interpreter((input));
        }
    }
    public static void main(String[] args) {
        start();
    }
}
