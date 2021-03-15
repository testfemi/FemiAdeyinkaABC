package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Modal_Page_Mytests extends AbstractBaseTest {

    @Test(priority = 2)
    public void modal_page_test() throws Exception {

        //Click on small Modal button
        App().Flow().navigateToUrl(App().Pages().ModalPage().getPageURl());
        App().Pages().ModalPage().clickshowSmallModal();


    }
    @Test(priority = 1)
    public void modal_page_test2() throws Exception {

        //Click on large Modal button
        App().Flow().navigateToUrl(App().Pages().ModalPage().getPageURl());
        App().Pages().ModalPage().clickshowLargeModal();


    }


}

