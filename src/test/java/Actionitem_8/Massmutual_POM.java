package Actionitem_8;

import PageObjects.BaseClass;
import ReuseableClasses.Reusable_Annotations_Class;
import _Actionitem.BaseClass_actionitem;
import org.testng.annotations.Test;

public class Massmutual_POM extends Reusable_Annotations_Class {




    @Test(priority = 1)
    public void WorksiteBenefitsPage() {
        driver.navigate().to("https://www.massmutual.com");
        BaseClass_actionitem.worksiteBenefitsPage().InsuranceTab();
        BaseClass_actionitem.worksiteBenefitsPage().WorksiteBenefits();
    }//end of test 1

    @Test(priority = 2)
    public void illnessInsurance() {
        driver.navigate().to("https://www.massmutual.com");
        BaseClass_actionitem.illnessInsurancePage().InsuranceTab();
        BaseClass_actionitem.illnessInsurancePage().WorksiteBenefits();
        BaseClass_actionitem.illnessInsurancePage().CriticalIllness();

    }//end of test 2

    @Test(priority = 3)
    public void OverviewPage() {
        driver.navigate().to("https://www.massmutual.com");
    BaseClass_actionitem.overviewPage().InsuranceTab();
    BaseClass_actionitem.overviewPage().OverviewTab();

    }//end of test 3

    @Test(priority = 4)
    public void UniversalInsurances() {
        driver.navigate().to("https://www.massmutual.com");
    BaseClass_actionitem.universalInsurances().InsuranceTab();
    BaseClass_actionitem.universalInsurances().UniversalInsurances();
    }//end of test 4

    @Test(priority = 5)
    public void CompareOptionsPage() {
        driver.navigate().to("https://www.massmutual.com");
        BaseClass_actionitem.compareOptionsPage().InsuranceTab();
        BaseClass_actionitem.compareOptionsPage().OverviewTab();
        BaseClass_actionitem.compareOptionsPage().compareOptions();
        BaseClass_actionitem.compareOptionsPage().InsuranceProducts();

    }//end of test 5



}//end of class
