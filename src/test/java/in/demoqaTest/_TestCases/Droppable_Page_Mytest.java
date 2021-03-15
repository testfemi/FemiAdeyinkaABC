package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Droppable_Page_Mytest extends AbstractBaseTest {

    @Test
    public void Droppable_page_Test () throws Exception {

        App().Flow().navigateToUrl(App().Pages().Droppable_Page().getPageURl());
        App().Pages().Droppable_Page().DragAndDropped();
    }
 }
