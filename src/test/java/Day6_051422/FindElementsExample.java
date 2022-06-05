package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //set chrome options
        ChromeOptions options = new ChromeOptions();
        //set the conditions to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
    //navigate to bing home
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        //click on images using class property with images
        //to ignore the white space in the property value we can use contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();
    }//end of main
}//end of java class
