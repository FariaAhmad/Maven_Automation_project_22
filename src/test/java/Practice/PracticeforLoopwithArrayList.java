package Practice;

import java.util.ArrayList;

public class PracticeforLoopwithArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Alif");
        names.add("Abbas");
        names.add("Allma");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(" The name of the boy is " + names.get(i));
        }//end of main
    }//end of java class
}//end of for loop
