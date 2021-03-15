package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Draggable_Page_Mytest extends AbstractBaseTest {


    @Test
 public void draggable_page_test() throws Exception {

        App().Flow().navigateToUrl(App().Pages().Draggable_Page().getPageURl());
        App().Pages().Draggable_Page().DragMe();
    }


}
