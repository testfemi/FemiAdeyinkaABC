package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class jobservetesting extends AbstractBaseTest{

    @Test
    public void checknext() throws Exception {

        App().Flow().navigateToUrl(App().Pages().JJobserve().getPageURl());
        App().Pages().JJobserve().clicknext();
    }


}
