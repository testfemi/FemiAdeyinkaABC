package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Droppable_Page_Elements {
WebDriver driver;
    @FindBy(id = "draggable") public WebElement clickdraggable;
    @FindBy (id = "droppable") public WebElement clickdroppable;

    public Demoqa_Droppable_Page_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
