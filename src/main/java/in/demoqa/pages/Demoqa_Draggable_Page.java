package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Draggable_Page_Elements;
import in.demoqa.elements.Demoqa_Droppable_Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_Draggable_Page {
    String pageUrl = "https://demoqa.com/dragabble";
    WebDriver driver;
    Actions actions;
            Demoqa_Draggable_Page_Elements draggable_Page_Elements;



            public Demoqa_Draggable_Page (WebDriver driver) {
                this.driver = driver;
                draggable_Page_Elements = new Demoqa_Draggable_Page_Elements(driver);
                actions = new Actions(driver);

            }

    public String getPageURl() {
        return pageUrl;
    }
         public void DragMe() {
                actions.dragAndDropBy(draggable_Page_Elements.clickdragBox, 133, 100).perform();

         }

}
