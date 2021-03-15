package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Date_Page_Elements;
import in.demoqa.elements.jobserveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Thread.sleep;

public class JobservePage {
    WebDriver driver;
    String pageUrl = "https://www.jobserve.com/gb/en/JobSearch.aspx?shid=E97890EB00634585F047";
    jobserveTest serverTest;
    Actions actions;

    public JobservePage(WebDriver driver) {
        this.driver = driver;
        serverTest = new jobserveTest(driver);
        actions = new Actions(driver);

    }
    public String getPageURl() {
        return pageUrl;
    }

    public void clicknext() throws Exception {
        List<WebElement> elements = driver.findElements(By.className("jobItem"));
        ListIterator<WebElement> listofelements = elements.listIterator();

          while (listofelements.hasNext()) {
            WebElement element = listofelements.next();
            if (element.isEnabled())
                element.click();
             // Thread.sleep(2000);
              serverTest.clicappl.click();
             // Thread.sleep(2000);
              serverTest.close.click();
             sleep(1000);
              actions.dragAndDropBy(serverTest.sliderbar, 0, 20).build().perform();
            sleep(1000);

               }
/*
        elements.get(4).click();
        serverTest.clicappl.click();
        Thread.sleep(2000);
        serverTest.close.click();

        elements.get(5).click();
        serverTest.clicappl.click();
        Thread.sleep(2000);
        serverTest.close.click();

        elements.get(3).click();
        serverTest.clicappl.click();
        Thread.sleep(2000);
        serverTest.close.click();
*/
            }
        }

            /*       *//*       if(element.isDisplayed()) {
               element.getText();
                element.click();
             //   Thread.sleep(2000);
               // driver.findElement(By.xpath("//*[@id=\"td_apply_btn_btm\"]")).click();*//*

                return;*/






