package Actionitem_1;

import java.util.ArrayList;

public class arrayListexamplewithforLoop {
    public static void main(String[] args) {
//Create a ArrayList for the countries and loop through all the values using for Loop
        ArrayList<String>countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Nepal");
        countries.add("China");
        countries.add("India");


        //Create aN ArrayList for the country codes and loop through all the values using for Loop
        ArrayList<Integer>countryCode = new ArrayList<>();
        countryCode.add(111);
        countryCode.add(222);
        countryCode.add(444);
        countryCode.add(555);

        for(int i = 0 ; i < countries.size(); i++){
            System.out.println(" My country is " + countries.get(i) + " and my countryCode is " +countryCode.get(i));
        }

    }//end of main

}//end of java class

