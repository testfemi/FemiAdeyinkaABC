package in.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jobserveTest {

    WebDriver driver;
@FindBy(xpath = "//*[@id=\"jobreslist_outercontainer\"]/div/div[2]/div") public WebElement sliderbar;

    @FindBy(css = "a[id = 'td_apply_btn']") public WebElement clicappl;

    @FindBy (className = ".jobItem") public WebElement selectJobs;
    @FindBy(xpath = "//*[@id=\"frm1\"]/div[9]/div[1]/a") public WebElement close;

    public jobserveTest (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
