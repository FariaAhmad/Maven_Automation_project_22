package Day8_0521222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitleexample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //set chrome options
        ChromeOptions options = new ChromeOptions();
        //set the conditions to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize
        options.addArguments("start-maximized");
        //define webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to googles site
        driver.navigate().to("https://www.google.com");
        //capture the title of the page and compare it with you expected GOOGLE title
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Google")){
            System.out.println("My title matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }
    }//end of main
}//end of java class
