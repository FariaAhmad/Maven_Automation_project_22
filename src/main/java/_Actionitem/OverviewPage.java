package _Actionitem;

import ReuseableClasses.Reusable_Actions_POM_Loggers;
import ReuseableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ReuseableClasses.Reusable_Annotations_Class.driver;

public class OverviewPage extends Reusable_Actions_POM_Loggers {
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public OverviewPage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='main-nav--bfc6539311b1bfb8964d']")
    WebElement insuranceTab;
    @FindBy(xpath = "//*[text()='Overview']")
    WebElement OverviewTab;
    public void InsuranceTab() {
        Reusable_Actions_POM_Loggers.clickAction(driver, insuranceTab, logger, "Insurance Tab");
    } //end of InsuranceTab
    public void OverviewTab(){
        Reusable_Actions_POM_Loggers.clickAction(driver,OverviewTab,logger,"Overview Tab");
    }//end of OverviewTab

}//end of class
