import java.lang.reflect.Array;
import java.util.*;
public class Toy_Interpreter {
    //create Dicts here of valid inputs
    //find a way to interpret various +,-,/,* dependant on what is being passed
    //each input is taken into an List and stored to check validity
    //if creating an identifier with an = it must start with a letter
    String input;
    List<String> validLetters = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
                                            "q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G",
                                            "H","I","J","K","L","M","N","O","P",
                                            "Q","R","S","T","U","V","W","X","Y","Z");
    List<Integer> validInts = Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> validDigits = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    Toy_Interpreter(String input) {
        this.input = input;
    }


}
