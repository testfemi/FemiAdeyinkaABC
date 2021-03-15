package in.demoqa.pages;


import in.demoqa.elements.Demoqa_Alerts_Page_Elements;
import org.openqa.selenium.WebDriver;

public class Demoqa_Alerts_Page {

    String pageUrl = "https://demoqa.com/alerts";
    WebDriver driver;
    Demoqa_Alerts_Page_Elements Alerts_Page_Elements;

    //Constructor
    public Demoqa_Alerts_Page (WebDriver driver) {
        this.driver = driver;
        Alerts_Page_Elements = new Demoqa_Alerts_Page_Elements(driver);

    }
    public String getPageURl() {

        return pageUrl;
    }

   // Click and accept alert
    public void clickAlertButton () {

        Alerts_Page_Elements.alertButton.click();
        this.driver.switchTo().alert().accept();
    }

//On button click, alert will appear after 5 seconds
    public void clickTimerAlertButton () throws Exception{

        Alerts_Page_Elements.timerAlertButton.click();
        Thread.sleep(6000);
        this.driver.switchTo().alert().accept();
    }

   // On button click, confirm box will appear
    public void clickConfirmButton () {
        Alerts_Page_Elements.confirmButton.click();
        this.driver.switchTo().alert().dismiss();

    }
    public void clickPromtButton () {
        Alerts_Page_Elements.promtButton.click();
        this.driver.switchTo().alert().sendKeys("This is my name");
        this.driver.switchTo().alert().accept();

    }

}
