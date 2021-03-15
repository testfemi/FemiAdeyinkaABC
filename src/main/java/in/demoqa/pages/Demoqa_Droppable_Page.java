package in.demoqa.pages;

import in.demoqa.elements.Demoqa_Draggable_Page_Elements;
import in.demoqa.elements.Demoqa_Droppable_Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_Droppable_Page {

    String pageUrl = "https://demoqa.com/droppable";
    WebDriver driver;
    Actions actions;
    Demoqa_Droppable_Page_Elements droppable_Page_Elements;



    public Demoqa_Droppable_Page (WebDriver driver) {
        this.driver = driver;
        droppable_Page_Elements = new Demoqa_Droppable_Page_Elements(driver);
        droppable_Page_Elements = new Demoqa_Droppable_Page_Elements(driver);
        actions = new Actions(driver);

    }

    public String getPageURl() {
        return pageUrl;
    }
    public void DragAndDropped () {
        actions.dragAndDrop(droppable_Page_Elements.clickdraggable, droppable_Page_Elements.clickdroppable).build().perform();


    }
    }
