package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Hover_Page_Mytests extends AbstractBaseTest {

    @Test (priority = 2)
    public void hover_page_test() throws Exception {
        App().Flow().navigateToUrl(App().Pages().Hover_Page().getPageURl());
        App().Pages().Hover_Page().hovertoolTipButton();
        App().Pages().Hover_Page().hovertoolTipTextField();

    }


}
