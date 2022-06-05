package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ArrayList_Fidelis {
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
        //navigate to Fidelis site
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(3000);
        driver.findElements(By.xpath("//*[text()='Shop For a Plan']")).get(0).click();
        Thread.sleep(1000);
        driver.findElements(By.xpath("//*[text()='Medicaid Managed Care']")).get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@href)='/find a doctor']")).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.xpath("//*[@class = 'fal fa search-plus']")).click();
        Thread.sleep(1000);
        //Close the new tab
        driver.close();
        //switch back to the default tab
        driver.switchTo().window(tabs.get(0));
        //then click on providers card
        driver.findElement(By.xpath("//*[@class= 'fal fa-stethoscope fa-fw']")).click();
    }//end of main
}//end of java class
