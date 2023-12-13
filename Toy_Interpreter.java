import java.lang.reflect.Array;
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
    List<String> userStatements = new ArrayList<>();
    List<String> validLetters = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                            "q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G",
                                            "H","I","J","K","L","M","N","O","P",
                                            "Q","R","S","T","U","V","W","X","Y","Z","_");
    List<Integer> validInts = Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> validDigits = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

    List<String> validSymbols = Arrays.asList("+", "-", "*", "/", "(", ")", "=", ";");

    List<String> invalidSymbols = Arrays.asList("!", "@", "#", "$", "&", "{", "}", "[", "]", ":");
    Toy_Interpreter() {

    }

    //checks to see if it contains any invalid symbols
    public boolean hasInvalidSymbols() {
        boolean check = false;

        for(int i = 0; i < invalidSymbols.size(); i++) {
            if(userStatements.get(i).contains(invalidSymbols.get(i))) {
                check = true;
            }
        }

        return check;
    }

    //checks to see if it is just a literal
    public boolean isLiteral() {
        boolean isALiteral = false;

        for (String userStatement : userStatements) {
            if (!userStatement.contains("=")) {
                isALiteral = true;
            }
        }

        return isALiteral;
    }

    //checks to make sure the first value in the identifier is not a number
    public boolean validIdentifier() {
        boolean validVariableName = true;

        for (String userStatement : userStatements) {
            if (userStatement.substring(0,1).matches("[0-9]"))
            {
                validVariableName = false;
            }
        }

        return validVariableName;
    }
}
