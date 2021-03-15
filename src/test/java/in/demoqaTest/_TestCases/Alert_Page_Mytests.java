package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Alert_Page_Mytests extends AbstractBaseTest {

    @Test
    public void alert_page_test() throws Exception {
  // 1.  Click Button to see alert
        App().Flow().navigateToUrl(App().Pages().AlertPage().getPageURl());
        App().Pages().AlertPage().clickAlertButton();

        // 3. On button click, confirm box will appear

        App().Pages().AlertPage().clickConfirmButton();

        // 4. On button click, prompt box will appear

        App().Pages().AlertPage().clickPromtButton();

        // 2. On button click, alert will appear after 5 seconds

        App().Pages().AlertPage().clickTimerAlertButton();
    }


}
