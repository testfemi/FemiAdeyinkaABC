package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Asserssion_Page_Elements {
    WebDriver driver;

    @FindBy(xpath = "//h5[contains(text(),'Student Registration Form')]")
    public WebElement checkLandingPage;


    public   Demoqa_Asserssion_Page_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }


    }
