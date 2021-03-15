package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Alerts_Page_Elements {

    WebDriver driver;
    //Click Button to see alert
    @FindBy(id = "alertButton")     public WebElement alertButton;
    //On button click, alert will appear after 5 seconds
    @FindBy(id = "timerAlertButton")     public WebElement timerAlertButton;
    //On button click, confirm box will appear
    @FindBy(id = "confirmButton")     public WebElement confirmButton;
    // On button click, prompt box will appear
    @FindBy(id = "promtButton")     public WebElement promtButton;

// Constructor
     public Demoqa_Alerts_Page_Elements(WebDriver driver) {
        //Initialse the driver
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

}
