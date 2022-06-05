package Actionitem_2;

import java.util.ArrayList;

public class loopConditions {
    public static void main(String[] args) {
        //Create  an Array list for Cities and print only when that city is Brooklyn or Manhattan.
        ArrayList<String> Cities = new ArrayList<>();

        Cities.add("Brooklyn");
        Cities.add("Manhattan");
        Cities.add("Queens");
        Cities.add("Long Island");

        //Using forLoop with conditions
        for (int i = 0; i < Cities.size(); i++) {


            if (Cities.get(i) == "Brooklyn") {
                System.out.println("My city is Brooklyn");

            } else if (Cities.get(i) == "Manhattan") {
                System.out.println("My city is Manhattan");
            }//end of Conditions
        }//End of forloop
    }//End of Main
}//end of java class


