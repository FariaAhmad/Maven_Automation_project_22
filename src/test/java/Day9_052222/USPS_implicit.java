package Day9_052222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class USPS_implicit {
    public static void main(String[] args) {

            //setup your Chrome Driver with Web Driver Manager
            WebDriverManager.chromedriver().setup();
            //set chrome options arguments
            ChromeOptions options = new ChromeOptions();
            //start browser in incognito mode
            options.addArguments("incognito");
            //maximize the browser
            options.addArguments("start-maximized");
            //Define your Chrome Driver
            WebDriver driver = new ChromeDriver(options);

            //set gobal implicit wait
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //navigate to usps home page
        driver.navigate().to("https://www.usps.com");

        //call out mouse actions
        Actions actions = new Actions(driver);

        //declare and define implicit wait
        WebDriverWait wait = new WebDriverWait(driver,8);
        //hover to quick tools
        WebElement quicktools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tools']")));
        actions.moveToElement(quicktools).perform();

        //click on track package
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();

        WebElement packageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        packageField.click();
        packageField.sendKeys("122223232232");
    }//end of main
}//end of java class
