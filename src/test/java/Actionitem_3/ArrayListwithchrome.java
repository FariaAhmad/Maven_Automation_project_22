package Actionitem_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.ArrayList;

public class ArrayListwithchrome {
    public static void main(String[] args) {
        //create an arraylist for cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lahore");
        cities.add("Karachi");
        cities.add("Multan");
        cities.add("Islamabad");
        cities.add("Rawalpindi");
        //using for loop so it can loop through multiple times.
        for (int i = 0 ; i< cities.size();i++) {
            //Setting up webbrowser
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.bing.com/");
            //maxmize the driver
            driver.manage().window().maximize();
           //now find the element and put in using xpath
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("cities");
            //submit the search
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();
            //capture the search
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //only print the number so use split
            String[] arrayResult = searchResult.split(" ");
            //now print the results
            System.out.println("My search result for " + cities.get(i) + " is " + arrayResult[0]);

            //quit the driver
            driver.quit();

        }//end of for loop
    }//end of main
}//end of java class