package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Asserssion_Page_Elements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.TestNGAntTask.Mode.testng;

public class Demoqa_Asserssion_Page {
    String pageUrl = "https://demoqa.com/automation-practice-form";
    WebDriver driver;
    Demoqa_Asserssion_Page_Elements asserssion_Page_Elements;

    public Demoqa_Asserssion_Page(WebDriver driver) {
        this.driver = driver;
        asserssion_Page_Elements = new Demoqa_Asserssion_Page_Elements(driver);
    }

    public String getPageURl() {
        return pageUrl;
    }

    public void VerifyStudentRegistration() {
        String Expectedwordings = "Student Registration For";
        String Actualwordings = asserssion_Page_Elements.checkLandingPage.getText();
        org.testng.Assert.assertEquals(Expectedwordings, Actualwordings, "This is alert for me");

        System.out.println("Expected Result = " + Expectedwordings );
        System.out.println("Actual result =  " + Actualwordings );

    }


}
