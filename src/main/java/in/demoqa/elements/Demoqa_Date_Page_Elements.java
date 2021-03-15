package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa_Date_Page_Elements {
    WebDriver driver;

@FindBy (id = "datePickerMonthYearInput") public WebElement datePickerMonthYearInput;
@FindBy (id = "dateAndTimePickerInput") public WebElement dateAndTimePickerInput;
@FindBy(css = "div[class='main-header']") public WebElement clickOutside;

    public Demoqa_Date_Page_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}
