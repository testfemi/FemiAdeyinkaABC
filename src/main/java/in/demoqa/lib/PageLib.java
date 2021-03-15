package in.demoqa.lib;

import in.demoqa.pages.*;
import org.openqa.selenium.WebDriver;

public class PageLib {

    private WebDriver driver;
    private Demoqa_Alerts_Page alerts_Page;
    private Demoqa_Modal_Page modal_Page;
    private Demoqa_Hover_Page hover_Page;
    private Demoqa_Date_Page date_Page;
    private Demoqa_Forms_Page forms_Page;
    private Demoqa_Asserssion_Page asserssion_Page;
    private Demoqa_Draggable_Page draggable_Page;
    private Demoqa_Droppable_Page droppable_Page;
    private JobservePage jobserve;

    public PageLib(WebDriver driver) {
        this.driver = driver;
        alerts_Page = new Demoqa_Alerts_Page(this.driver);
        modal_Page = new Demoqa_Modal_Page(this.driver);
        hover_Page = new Demoqa_Hover_Page(this.driver);
        date_Page = new Demoqa_Date_Page(this.driver);
        forms_Page = new Demoqa_Forms_Page(this.driver);
        asserssion_Page = new Demoqa_Asserssion_Page(this.driver);
        draggable_Page = new Demoqa_Draggable_Page(this.driver);
        droppable_Page = new Demoqa_Droppable_Page(this.driver);
        jobserve = new JobservePage(this.driver);

    }

    public Demoqa_Alerts_Page AlertPage() {
        return alerts_Page;
    }

    public Demoqa_Modal_Page ModalPage() {
        return modal_Page;
    }

    public Demoqa_Hover_Page Hover_Page() {
        return hover_Page;
    }

    public Demoqa_Date_Page Date_Page() {
        return date_Page;
    }

    public Demoqa_Forms_Page Forms_Page() {
        return forms_Page;
    }

    public Demoqa_Asserssion_Page Asseersion_Page() {
        return asserssion_Page;
    }

    public Demoqa_Draggable_Page Draggable_Page() {
        return draggable_Page;
    }

    public Demoqa_Droppable_Page Droppable_Page() {
        return droppable_Page;
    }

    public JobservePage JJobserve() {
        return jobserve;
    }
}
