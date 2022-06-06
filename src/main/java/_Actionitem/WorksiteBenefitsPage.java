package _Actionitem;

import ReuseableClasses.Reusable_Actions_POM_Loggers;
import ReuseableClasses.Reusable_Annotations_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorksiteBenefitsPage extends Reusable_Annotations_Class{
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public WorksiteBenefitsPage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class.logger;
    }//end of constructor

    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='main-nav--bfc6539311b1bfb8964d']")
    WebElement InsuranceTab;
    @FindBy(xpath = "//*[text()='Worksite Benefits']")
    WebElement WorksiteBenefits;
    public void InsuranceTab() {
        Reusable_Actions_POM_Loggers.clickAction(driver, InsuranceTab, logger, "Insurance Tab");
    } //end of InsuranceTab
    public void WorksiteBenefits(){
        Reusable_Actions_POM_Loggers.clickAction(driver,WorksiteBenefits,logger,"Worksite benefits");
    }//end of test 5


}//end of class
