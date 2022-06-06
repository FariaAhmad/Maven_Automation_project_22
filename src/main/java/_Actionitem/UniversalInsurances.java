package _Actionitem;

import ReuseableClasses.Reusable_Actions_POM_Loggers;
import ReuseableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversalInsurances extends Reusable_Annotations_Class {
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public UniversalInsurances(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='main-nav--bfc6539311b1bfb8964d']")
    WebElement insuranceTab;
    @FindBy(xpath = "//*[text()='Universal']")
    WebElement universalInsurances;


    public void InsuranceTab() {
            Reusable_Actions_POM_Loggers.clickAction(driver, insuranceTab, logger, "Insurance Tab");
        } //end of InsuranceTab
    public void UniversalInsurances() {
        Reusable_Actions_POM_Loggers.clickAction(driver, universalInsurances, logger, "Universal tab");
    } //end of Universal




}//end of class
