package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Date_Page_Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Demoqa_Date_Page {
    String pageUrl = "https://demoqa.com/date-picker";
    String plusOneMonthDateOnly = "01/05/2022";
    String plusOneMonthDateTime = "January 27, 2022 06:55 AM";
    WebDriver driver;
    Actions actions;
    Demoqa_Date_Page_Elements Date_Page_Elements;

    public Demoqa_Date_Page(WebDriver driver) {
        this.driver = driver;
        Date_Page_Elements = new Demoqa_Date_Page_Elements(driver);
        actions = new Actions(driver);

    }

    public String getPageURl() {
        return pageUrl;
    }

/*    public void clearelementfields () throws Exception {
        Date_Page_Elements.datePickerMonthYearInput.clear();
    }*/
    public void enterdatePickerMonthYearInput() throws Exception {

        //User to double click on any items
        actions.moveToElement(Date_Page_Elements.datePickerMonthYearInput).doubleClick().build().perform();
        //I have used the control as the filed will not clear
        Date_Page_Elements.datePickerMonthYearInput.sendKeys(Keys.chord(Keys.CONTROL, "A"));
        Date_Page_Elements.datePickerMonthYearInput.sendKeys(Keys.chord(Keys.CONTROL, "X"));
        Date_Page_Elements.datePickerMonthYearInput.sendKeys(plusOneMonthDateOnly);
        Date_Page_Elements.clickOutside.click();


    }
    public void enterdateAndTimePickerInput() {
        Date_Page_Elements.dateAndTimePickerInput.clear();
        Date_Page_Elements.dateAndTimePickerInput.sendKeys(plusOneMonthDateTime);
        Date_Page_Elements.clickOutside.click();
    }
}



/*

Another way to work on date
        WebElement clickdateandTime = base.driver.findElement(By.id("dateAndTimePickerInput"));
        clickdateandTime.click();

        while (true) {
            String verifyMonthYear1 = base.driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
            if(verifyMonthYear1.equals(monthyearout)) {
                break;

           }else {
                base.driver.findElement(By.xpath("//button[contains(text(),'Next Month')]")).click();
            }
        }

        base.driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[contains(text(),"+dayout+")]")).click();
        base.driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[contains(text(),"+timeout+")]")).click();
        System.out.println(timeout);
*/