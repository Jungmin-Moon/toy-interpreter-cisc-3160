import java.util.*;
public class ConvertInput {




    //methods for one statement, 2 and 2+ statements
    void oneStatement(List<String> oneEntryList) {

        String tempEntry = oneEntryList.get(0);

        if (tempEntry.contains("+") || tempEntry.contains("*") || tempEntry.contains("/") || tempEntry.contains("-")) {

        } else {
            System.out.println(oneEntryList.get(0));
        }
    }

    void twoStatement(List<String> twoEntryList) {

    }

    void multipleStatement(List<String> multiEntryList) {

    }

    /*
    need to check for size of list
    if its only 1 then it just needs to print out what is stored or if it is something like
    x = 5 + 5
    parsing both ints and adding them into a variable to then print with the variable

     */
    void print(List<String> list) {
        if (list.size() == 1) {
            oneStatement(list);
        }
    }
}
