package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Modal_Page_Elements;
import org.openqa.selenium.WebDriver;

public class Demoqa_Modal_Page {

    String pageUrl = "https://demoqa.com/modal-dialogs";
    WebDriver driver;
    Demoqa_Modal_Page_Elements Modal_Page_Elements;


    //Constructor
    public Demoqa_Modal_Page(WebDriver driver) {
        this.driver = driver;
        Modal_Page_Elements = new Demoqa_Modal_Page_Elements(driver);

    }

    public String getPageURl() {

        return pageUrl;
    }

    //Click on small Modal button
    public void clickshowSmallModal() throws Exception {
        Modal_Page_Elements.showSmallModal.click();
        Thread.sleep(2000);
        Modal_Page_Elements.closeSmallModal.click();

    }
    //Click on Large Modal button
    public void clickshowLargeModal() throws Exception {
        Modal_Page_Elements.showLargeModal.click();
        Thread.sleep(2000);
        Modal_Page_Elements.closeLargeModal.click();

    }


}
