package in.demoqaTest._TestCases;

import org.testng.annotations.Test;


public class Date_Page_Mytests extends AbstractBaseTest {

    @Test(priority = 1)
    public void Date_page_test() throws Exception {

        App().Flow().navigateToUrl(App().Pages().Date_Page().getPageURl());
       // App().Pages().Date_Page().clearelementfields();
        App().Pages().Date_Page().enterdatePickerMonthYearInput();

        App().Pages().Date_Page().enterdateAndTimePickerInput();

    }
    }
