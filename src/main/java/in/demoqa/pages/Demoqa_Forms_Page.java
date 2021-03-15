package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Forms_Page_Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class Demoqa_Forms_Page {

    String pageUrl = "Home_Page_Elements";
    String textfirstname = "Femi";
    String textlastname = "Adeyinka";
    String textEmail = "fmbase@me.com";
    String textUserNumber = "0785026985";
    String textDateOfBirth = "20 Jan 2023";
    String textSubjects = "Accounting";
    String textAddress = "54 Grange Road, Leeds, LS14 5FG";
    String textState = "NCR";
    Actions actions;


    WebDriver driver;
    Demoqa_Forms_Page_Elements Forms_Page_Elements;

    public Demoqa_Forms_Page(WebDriver driver) {
        this.driver = driver;
        Forms_Page_Elements = new Demoqa_Forms_Page_Elements(driver);
        actions = new Actions(driver);

        }



    public String getPageURl() {
        return pageUrl;
    }

    public void EnterfirstName() {
        Forms_Page_Elements.enterfirstName.sendKeys(textfirstname);
    }

    public void EnterLastName() {
        Forms_Page_Elements.enterlastName.sendKeys(textlastname);
    }

    public void EnterEmail() {
        Forms_Page_Elements.enteruserEmail.sendKeys(textEmail);

    }

    public void clickMale() {
        Forms_Page_Elements.selectFemale.click();
    }

    public void EnterUserNumber() {
        Forms_Page_Elements.enteruserNumber.sendKeys(textUserNumber);
    }

    public void EnterDateOfBirt() throws InterruptedException{
/*
        Forms_Page_Elements.enterdateOfBirthInput.clear();
        Forms_Page_Elements.enterdateOfBirthInput.sendKeys(textDateOfBirth);
        Forms_Page_Elements.clickoutside.click();*/

        actions.moveToElement(Forms_Page_Elements.enterdateOfBirthInput).click().build().perform();
        Forms_Page_Elements.enterdateOfBirthInput.sendKeys(Keys.chord(Keys.CONTROL, "A"));
/*      Forms_Page_Elements.enterdateOfBirthInput.sendKeys(Keys.chord(Keys.TAB));
        Thread.sleep(4000);*/
        Forms_Page_Elements.enterdateOfBirthInput.sendKeys(textDateOfBirth);
        Forms_Page_Elements.enterdateOfBirthInput.sendKeys(Keys.chord(Keys.ESCAPE));
        //Forms_Page_Elements.clickoutside.click();
    }

    public void EnterSubjects() {
        Forms_Page_Elements.enterSubjects.sendKeys(textSubjects);
    }
    public void HobbieSportAndMusic() {
        Forms_Page_Elements.selectSports.click();
        Forms_Page_Elements.selectMusic.click();
    }
public void uploadDocs() {
    Forms_Page_Elements.selectuploadPicture.sendKeys("C:\\Users\\Fmbase\\Desktop\\codeSampleForCompanies\\images\\chromedriver.exe");
}

public void EnterCurrentAddress() {
        Forms_Page_Elements.entercurrentAddress.sendKeys(textAddress);
        Forms_Page_Elements.entercurrentAddress.sendKeys(Keys.chord(Keys.TAB));
}

public void EnterState() throws Exception {
    Forms_Page_Elements.enterState.click();

    /*    Forms_Page_Elements.enterState.sendKeys(textState);
    Thread.sleep(2000);
    Forms_Page_Elements.enterState.sendKeys(Keys.chord(Keys.TAB));
  //Forms_Page_Elements.enterdateOfBirthInput.sendKeys(Keys.chord(Keys.TAB));
 */

}

public void ClickSubmitButton () throws Exception {
        //Unable to use the click button
    Forms_Page_Elements.clicksubmit.sendKeys(Keys.chord(Keys.ENTER));


}


}