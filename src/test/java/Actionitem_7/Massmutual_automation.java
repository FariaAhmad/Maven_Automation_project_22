package Actionitem_7;


import ReuseableClasses.Reusable_Actions_Loggers;
import ReuseableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Massmutual_automation {

    //declare the local driver outside so that it can be reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;
    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field
    @Test(priority = 1)
    public void clickOnInsuranceTab(){
        logger = reports.startTest("Click On Insurance Tab");
        driver.navigate().to("https://www.massmutual.com");
        //click on insurace tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[@id='main-nav--bfc6539311b1bfb8964d']",logger,"Insurance Tab");
    }//end of test 1

        @Test(dependsOnMethods = "clickOnInsuranceTab")
        public void clickOnOverview(){
            logger = reports.startTest("Click On Overview");

            //click on overview
        Reusable_Actions_Loggers.clickAction(driver,"//*[text()='Overview']",logger,"insurance overview");


    }//end of test 2

    @Test(priority = 2)
    public void contactafinancialprofessional() {
        logger = reports.startTest("Click On contact a financial professional");
        //click on contact a professional
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Contact a financial professional']", logger, "contact a professional");
    }//end of test 3

    @Test(dependsOnMethods = "contactafinancialprofessional" )
    public void verifyTitle() {
        logger = reports.startTest("verify title");
        //verify the title of the page
        Reusable_Actions_Loggers.verifyTitle(driver, logger, "Have a Financial Professional Contact You | MassMutual");
        reports.endTest(logger);
    }//end of Test 4

    @Test(priority = 3)
    public void estimateLifeInsurance() throws InterruptedException {
        logger = reports.startTest("Click On Insurance Tab");
        //arraylist for months
        ArrayList<String>birthmonth = new ArrayList<>();
        birthmonth.add("5");
        //create array list for days
        ArrayList<String>birthDay = new ArrayList<>();
        birthDay.add("29");
        //create array list for year
        ArrayList<String>birthYear = new ArrayList<>();
        birthYear.add("1999");
        ArrayList<String>zipCode = new ArrayList<>();
        zipCode.add("11219");

        //for loop
        for (int i = 0; i < birthmonth.size(); i++) {
            //go to the website
        driver.navigate().to("https://www.massmutual.com");
        //click on insurance tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
        //click on Whole Life Insurance
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Universal']", logger, "Universal tab");
        Thread.sleep(1500);
        //using jse to scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,800)");
        //type into the month box of the estimation form
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='birthMonth']",birthmonth.get(i),logger,"birthmonths");
        //type into the day box
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='birthDay']",birthDay.get(i),logger,"birthDay");
        //type into the year box
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='birthYear']",birthYear.get(i),logger,"birthYear");
        //type into the zipcode box
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='zipCode']",zipCode.get(i),logger,"zipcode");
        //now submit the form
        Reusable_Actions_Loggers.submitAction(driver,"//*[@type='submit']",logger,"submit");
        //it should take you to a different page


        }//end of forLoop

    }//end of test 5

    @Test(priority = 4)
    public void findFeedbackButton() throws InterruptedException{
        logger = reports.startTest("Click on feedback button");
       //navigate to massmutual
        driver.navigate().to("https://www.massmutual.com");
        //click on insurance tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
        //click on Term insurance
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Term']", logger, "Term tab");
        //click on the feedback button
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='surveyFeedbackTab']", logger, "Feedback");
        //see the feedback box
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class='modal-content']", logger, "Feedback box");
        Thread.sleep(3000);
        //close the feedback box
        Reusable_Actions_Loggers.submitAction(driver, "//*[@class='close']", logger, "close the Feedback box");
     }//end of test 6

    @Test(priority = 5)
    public void compareOptions() throws InterruptedException{
        logger = reports.startTest("Click on compare options");
        //navigate to massmutual
        driver.navigate().to("https://www.massmutual.com");
        //click on insurance tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
        //click on Life Insurance Overview tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Life Insurance Overview']", logger, "Overview tab");
       Thread.sleep(3000);
        //using jse to scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,800)");
        //click on online quote
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Compare term life to permanent life insurance options']", logger, "compareoptions");
       Thread.sleep(3000);
        //now go back to insurance products
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Insurance Products']", logger, "Insurance Products");
    }//end of test 7

        @Test(priority = 6)
        public void workSiteBenefits() throws InterruptedException {
            logger = reports.startTest("Click on worksite Benefits");
            //navigate to massmutual
            driver.navigate().to("https://www.massmutual.com");
            //click on insurance tab
            Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
            //click on Worksite Benefits
            Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Worksite Benefits']", logger, "Worksite benefits");



        }//end of test 8
    @Test(priority = 7)
    public void accidentInsurance() throws InterruptedException {
        logger = reports.startTest("Click on Accident insurance");
        //navigate to massmutual
        driver.navigate().to("https://www.massmutual.com");
        //click on insurance tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
        //click on Worksite Benefits
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Worksite Benefits']", logger, "Worksite benefits");
        //see the accident insurance
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Group Accident Insurance']", logger, "Group Accident Insurance");

    }//end of test 9
    @Test(priority = 8)
    public void illnessInsurance() throws InterruptedException {
        logger = reports.startTest("Click on illness insurance");
        //navigate to massmutual
        driver.navigate().to("https://www.massmutual.com");
        //click on insurance tab
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id='main-nav--bfc6539311b1bfb8964d']", logger, "Insurance Tab");
        //click on Worksite Benefits
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Worksite Benefits']", logger, "Worksite benefits");
        //see the illness insurance
        Reusable_Actions_Loggers.clickAction(driver, "//*[text()='Group Critical Illness Insurance']", logger, "Group Critical Illness Insurance");

    }//end of test 10
            @AfterSuite
    public void quitSession(){
        driver.quit();
        reports.flush();
    }//end of after suite







}//end of class
