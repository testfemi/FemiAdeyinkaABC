package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Hover_Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_Hover_Page {
    String pageUrl = "https://demoqa.com/tool-tips";
    WebDriver driver;
    Actions actions;
    Demoqa_Hover_Page_Elements Hover_Page_Elements;


    // Constructor:::

    public  Demoqa_Hover_Page(WebDriver driver) {

        this.driver = driver;
        Hover_Page_Elements = new Demoqa_Hover_Page_Elements(driver);
        actions = new Actions(driver);
    }

    public String getPageURl() {

        return pageUrl;
    }

    public  void hovertoolTipButton () {
        actions.moveToElement(Hover_Page_Elements.toolTipButton).build().perform();


    }
    public  void hovertoolTipTextField () {
        actions.moveToElement(Hover_Page_Elements.toolTipTextField).build().perform();
    }

    public void verifytexToolTopContainer () {

    }



}
