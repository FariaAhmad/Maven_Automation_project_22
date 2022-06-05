package ReuseableLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseableMethods {
    //create a void method to add two numbers
    public static void addTwoNumbers(int num1, int num2){
        System.out.println("The result of two numbers is " + (num1+num2));
    }//end of add two number method

    //create a return integar method to subtract two numbers
    public static int subtractTwoNumbers(int a, int b){
        int result = a-b;
        System.out.println("The result of two numbers for substraction is " + result);
        return result;
    }//end of substraction return method
    //create a click by index method
    public static void clickByIndexAction(WebDriver driver, String xpath, int indexNumber, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickByIndexAction

}//end of java class
