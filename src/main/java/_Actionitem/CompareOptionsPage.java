package _Actionitem;


import ReuseableClasses.Reusable_Actions_POM_Loggers;
import ReuseableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareOptionsPage extends Reusable_Annotations_Class {
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public CompareOptionsPage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='main-nav--bfc6539311b1bfb8964d']")
    WebElement InsuranceTab;
    @FindBy(xpath = "//*[text()='Life Insurance Overview']")
    WebElement OverviewTab;
    @FindBy(xpath = "//*[text()='Compare term life to permanent life insurance options']")
    WebElement compareOptions;
    @FindBy(xpath = "//*[text()='text()='Insurance Products']")
    WebElement InsuranceProducts;

    public void InsuranceTab() {
        Reusable_Actions_POM_Loggers.clickAction(driver, compareOptions, logger, "Insurance Tab");
    } //end of InsuranceTab
    public void OverviewTab(){
        Reusable_Actions_POM_Loggers.clickAction(driver,compareOptions,logger,"Overview Tab");
    }//end of OverviewTab
    public void compareOptions() {
        Reusable_Actions_POM_Loggers.clickAction(driver, compareOptions, logger, "compare Options");
    } //end of compareOptions
    public void InsuranceProducts(){
        Reusable_Actions_POM_Loggers.clickAction(driver,compareOptions,logger,"Insurance Products");
    }//end of Insurance Products


}//end of class
