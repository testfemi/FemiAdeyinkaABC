package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Forms_Page_Elements {
    WebDriver driver;
    //Enter first name field
    @FindBy(id = "firstName")
    public WebElement enterfirstName;
    // Enter lastName field
    @FindBy(id = "lastName")
    public WebElement enterlastName;
    // Enter Email Address
    @FindBy(id = "userEmail")
    public WebElement enteruserEmail;
    //Select Gender = Female
    @FindBy(css = "label[for='gender-radio-2']")
    public WebElement selectFemale;
    //Enter Mobile Number
    @FindBy(id = "userNumber")
    public WebElement enteruserNumber;
    //Enter Date of Birth
    @FindBy(id = "dateOfBirthInput")
    public WebElement enterdateOfBirthInput;
    //Enter Subjects
    @FindBy (css = "div[class='subjects-auto-complete__control css-yk16xz-control']")
    public WebElement enterSubjects;
    // Select 2 Hobbies
    //Sports:
    @FindBy(xpath = "//label[contains(text(),'Sports')]")
    public WebElement selectSports;
    //Reading:
    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    public WebElement selectReading;
    // Music:
    @FindBy(xpath = "//label[contains(text(),'Music')]")
    public WebElement selectMusic;
    //Select pictures
    @FindBy(id = "uploadPicture")
    public WebElement selectuploadPicture;
    // Enter Current Address
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement entercurrentAddress;
    // Enter State = NCR
    @FindBy(xpath = "//*[@id=\"state\"]/div/div[1]/div[1]")
    public WebElement enterState;
    //Enter City = Karnal
    @FindBy(id = "//*[@id=\"city\"]/div/div[1]")
    public WebElement enterCity;
    //Click outsideBox
    @FindBy(id = "userNumber")
    public WebElement clickoutside;
    // click submit
    @FindBy(css = "#submit")
    public WebElement clicksubmit;


    public Demoqa_Forms_Page_Elements(WebDriver driver) {
        // Initialise the driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}