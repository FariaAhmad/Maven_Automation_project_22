package Practice;

import java.net.SocketTimeoutException;

public class Practicesplitmessage {
    public static void main(String[] args) {
        String splitMessage = "My name is Faria Ahmad";
        String[] splitMessageArray = splitMessage.split(" ");
       System.out.println("My name is " + splitMessageArray[3]);
    }//end of main
}//end of java class


