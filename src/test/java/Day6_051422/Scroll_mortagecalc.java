package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_mortagecalc {
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
        //navigate to mortgagecalculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //declare javascriptexecutor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to pixel 400 on mortage calc website
  //   jse.executeScript("scroll(0,800)");
        //wait a bit for browser to perform scrolling
  //    Thread.sleep(3000);
  //declare a webelment variable that we want to scroll into
        WebElement sharebutton = driver.findElement(By.xpath("//*[@id = 'share_button']"));
        //scroll into share this calculation button
        jse.executeScript("arguments[0].scrollIntoView(true);", sharebutton);
        Thread.sleep(2000);
        //click on the share this calculator button
        sharebutton.click();
        Thread.sleep(2000);
        //scroll back up
        jse.executeScript("scroll(0,-400)");
        Thread.sleep(2000);
        //quit the chrome driver
        driver.quit();
    }//end of main
}//end of java
