package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Hover_Page_Elements {

    WebDriver driver;
    @FindBy (id = "toolTipButton") public WebElement toolTipButton;
    @FindBy (id = "toolTipTextField") public WebElement toolTipTextField;
    @FindBy (id = "texToolTopContainer") public WebElement texToolTopContainer;

    public Demoqa_Hover_Page_Elements(WebDriver driver) {
                this.driver = driver;
        PageFactory.initElements(driver, this);

    }



}
