import java.util.Scanner;

public class Menu_Class {
    public void start() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equalsIgnoreCase("end") && input.equalsIgnoreCase("con")) {
            Toy_Interpreter userInputs = new Toy_Interpreter();
            while(!input.equalsIgnoreCase("done")) {
                userInputs.userStatements.add(input);
                input = scan.nextLine();
            }
            System.out.println("Output: ");
            userInputs.printOutput();

            //input to stop or continue interpreter
            input = scan.nextLine();
        }
    }

    Menu_Class() {

    }

    public void welcomeMessage() {
        System.out.println("Welcome to the toy interpreter.");
        System.out.println("This interpreter will be able to do very basic things.");
        System.out.println("Type in end to stop the interpreter.");
        System.out.println("Type in done when you are done making statements.");
        System.out.println("Type in con to continue using the interpreter after seeing the output.");
    }
}
