package _Actionitem;

import ReuseableClasses.Reusable_Annotations_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass_actionitem extends Reusable_Annotations_Class {
    public BaseClass_actionitem(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    //create static reference for  massmutual Home Page
    public static IllnessInsurancePage illnessInsurancePage() {
        IllnessInsurancePage illnessInsurancePage = new IllnessInsurancePage(driver);
        return illnessInsurancePage;
    }//end of illnessInsurancePage method

    //create static reference for compare Options page
    public static CompareOptionsPage compareOptionsPage() {
        CompareOptionsPage compareOptionsPage = new CompareOptionsPage(driver);
        return compareOptionsPage;
    }//end of CompareOptionsPage method


    //create static reference for overview page
    public static OverviewPage overviewPage() {
        OverviewPage overviewPage = new OverviewPage(driver);
        return overviewPage;
    }//end of OverviewPage method

    //create static reference for Universal Insurances page
    public static UniversalInsurances universalInsurances() {
        UniversalInsurances universalInsurances = new UniversalInsurances(driver);
        return universalInsurances;
    }//end of UniversalInsurances method


    //create static reference for Worksite Benefits Page
    public static WorksiteBenefitsPage worksiteBenefitsPage() {
        WorksiteBenefitsPage worksiteBenefitsPage = new WorksiteBenefitsPage(driver);
        return worksiteBenefitsPage;
    }//end of WorksiteBenefitsPage method


}



