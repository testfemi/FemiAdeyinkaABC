package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Draggable_Page_Elements {
    WebDriver driver;

    @FindBy (id = "dragBox") public WebElement clickdragBox;

    //draggableExample-tab-axisRestriction
    @FindBy (id = "draggableExample-tab-axisRestriction") public WebElement clickdraggableTabAxis;
    @FindBy (id = "restrictedX") public WebElement clickrestrictedX;
    @FindBy (id = "restrictedY") public WebElement clickrestrictedY;


    public Demoqa_Draggable_Page_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




}

