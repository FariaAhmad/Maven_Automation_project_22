package Day3_043022;

import ReuseableLibraries.ReuseableMethods;

public class TestingMethods {

    public static void main(String[] args) {
        //call the add two numbers and execute it
        ReuseableMethods.addTwoNumbers(20,30);

        //call the return method and store it in a variable to perform something else
       int finalResult = ReuseableMethods.subtractTwoNumbers(50, 10);
       int newResult = finalResult +10;
           System.out.println("new result is " + newResult);

        }//end of substraction of two number method

    }//end of main


