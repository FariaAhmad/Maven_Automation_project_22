package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class practicegooglesearchtest {
    public static void main(String[] args) throws InterruptedException {
        //setup chromedriver manager
        WebDriverManager.chromedriver().setup();
        //define the webdriver with what we using
        WebDriver driver = new ChromeDriver();
        //go to google home
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //maximize the driver
        driver.manage().window().maximize();
        //locate an element and type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        String searchResults = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        // System.out.println("Result is " + searchResults);
        //extract out the number and print the search number only
        String[] arrayResult = searchResults.split(" ");
        String replaceParanth = arrayResult[3].replace("(","");
        System.out.println("My search number is " + arrayResult[1]);
        //quit the driver
        driver.quit();
    }//end of main
}//end of java







