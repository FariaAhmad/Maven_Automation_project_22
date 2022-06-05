package Practice;

import java.util.ArrayList;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Lahore");
        city.add("Karachi");
        city.add("Murree");

        ArrayList<String> Language = new ArrayList<>();
        Language.add("Urdu");
        Language.add("Punjabi");
        Language.add("Pashto");

         System.out.println(" My city is " + city.get(0) + " My language is " + Language.get(0));
    }//end of main
}//end of java clas
