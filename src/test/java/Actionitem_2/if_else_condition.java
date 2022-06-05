package Actionitem_2;

public class if_else_condition {
    public static void main(String[] args) {

        String myVariable;
        myVariable = "My grade is ?";
        System.out.println("My grade is ?");

        //Declare value for the grade

        int grade = 90;
        if (grade >= 90 & grade <= 100){
        System.out.println("Grade is A");
        } else if (grade >= 80 & grade <= 90) {
            System.out.println("Grade is B");
        } else if (grade >= 70 & grade <= 80) {
            System.out.println("Grade is C");
        }else if (grade >= 60 & grade <= 70) {
            System.out.println("Grade is D");
        }else if ( grade <= 60) {
            System.out.println("Grade is F");

        }//end of conditions
    }//end of main
}//end of java class
