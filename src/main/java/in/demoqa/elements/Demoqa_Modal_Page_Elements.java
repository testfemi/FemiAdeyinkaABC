package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Modal_Page_Elements {

    WebDriver driver;
    @FindBy(id = "showSmallModal") public WebElement showSmallModal;
    @FindBy(id = "closeSmallModal") public WebElement closeSmallModal;
    @FindBy(id ="showLargeModal") public WebElement showLargeModal;
    @FindBy(id ="closeLargeModal") public WebElement closeLargeModal;

    //Constructor
    public Demoqa_Modal_Page_Elements (WebDriver driver) {
        //Initialise driver
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
}
