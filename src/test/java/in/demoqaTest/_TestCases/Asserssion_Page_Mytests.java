package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Asserssion_Page_Mytests extends AbstractBaseTest {

    @Test
    public void VerifyAsserssion () throws Exception {
        App().Flow().navigateToUrl(App().Pages().Asseersion_Page().getPageURl());
        App().Pages().Asseersion_Page().VerifyStudentRegistration();

    }
}
