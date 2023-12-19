import java.util.*;
public class Toy_Interpreter {
    //create Dicts here of valid inputs
    //find a way to interpret various +,-,/,* dependant on what is being passed
    //each input is taken into an List and stored to check validity
    //if creating an identifier with an = it must start with a letter
    /*
    need to check identifier starts with a letter but not a digit

    if assigning an int to a identifier can not start with 0 if there are more numbers after 0

    needs to understand +, -, * and /, (, ), ;

    needs to understand = is only gonna be for assigning

    need to check that inputs end in ; otherwise error

     */
    String input;

    ConvertInput cInput;
    List<String> userStatements = new ArrayList<>();
    List<String> validLetters = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                            "q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G",
                                            "H","I","J","K","L","M","N","O","P",
                                            "Q","R","S","T","U","V","W","X","Y","Z","_");
    List<Integer> validInts = Arrays.asList(1,2,3,4,5,6,7,8,9);
    //List<Integer> validDigits = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

    List<String> validSymbols = Arrays.asList("+", "-", "*", "/", "(", ")", "=", ";");

    List<String> invalidSymbols = Arrays.asList("!", "@", "#", "$", "&", "{", "}", "[", "]", ":");

    List<String> output = new ArrayList<>();
    Toy_Interpreter() {
        cInput = new ConvertInput();
    }

    //checks to see if it contains any invalid symbols
    boolean hasInvalidSymbols(String input) {
        boolean check = false;

        for (int i = 0; i < invalidSymbols.size(); i++) {
            if (input.contains(invalidSymbols.get(i))) {
                check = true;
            }
        }

        return check;
    }

    //checks to see if it is just a literal
    boolean isLiteral(String input) {

        return input.contains("=");
    }

    //checks to make sure the first value in the identifier is not a number
    boolean validIdentifier(String input) {
        boolean validVariableName = true;

        if (input.substring(0,1).matches("[0-9]")) {
            validVariableName = false;
        }

        return validVariableName;
    }

    boolean endswithSemiColon(String input) {
        boolean validEnding =  true;

        if (input.substring(input.length()-1).equals(";")) {
            validEnding = false;
        }
        return validEnding;
    }

    //counts how many (-) appear before hitting either a valid digit or ()
    int countDashes(String input) {

        //dashes meaning (-) that signify to negate something
        int numDashes = 0;

        String[] splitInput = input.split(" ");

        for (int i = 0; i < splitInput[2].length()-1; i++) {
            if (splitInput[2].charAt(i) == '-') {
                numDashes++;
            } else if (splitInput[2].charAt(i) == '(') {
                break;
            }
        }

        return numDashes;
    }

    boolean validDigitTerm (String input) {
        boolean validDigitStart = true;
        String[] splitInput = input.split(" ");

        if (splitInput[2].length() >= 2) {
            if (splitInput[2].charAt(0) == '0' && splitInput[2].charAt(1) == '0') {
                validDigitStart = false;
            }
        }

        return validDigitStart;
    }

    boolean validStart (String input) {

        String[] splitInput = input.split(" ");

        if (validDigitTerm(splitInput[2])) {
            return false;
        } else {
            return splitInput[2].substring(0,1).matches("[0-9]") ||
                    splitInput[2].substring(0,1).matches("[-(]");
        }
    }

    //boolean validExpression



    String validityChecker(String input) {
        String result = "";

        if (hasInvalidSymbols(input)) {
            result = "error";
        } else {
            if (isLiteral(input) && endswithSemiColon(input)) { //if it has = in and ends in a ; we move on
                if (validIdentifier(input)) {
                    if (validStart(input)) {
                        result = input.substring(0,input.length()-1);
                    } else {
                        result = "error";
                    }
                } else {
                    result = "error";
                }
            } else {
                result = "error";
            }
        }


        return result;
    }

    void addToOutputList() {
        for (int i = 0; i < userStatements.size(); i++) {
            String afterCheck = validityChecker(userStatements.get(i));
            output.add(afterCheck);
        }
    }


    void printOutput() {
        if (output.contains("error")) {
            System.out.println("error");
        } else {
            cInput.print(output);
        }
    }
}
