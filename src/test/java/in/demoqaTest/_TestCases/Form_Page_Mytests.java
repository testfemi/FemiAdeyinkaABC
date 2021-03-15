package in.demoqaTest._TestCases;

import org.testng.annotations.Test;

public class Form_Page_Mytests extends AbstractBaseTest {

    @Test
    public void form_page_test () throws Exception {
        App().Flow().navigateToUrl(App().Pages().Forms_Page().getPageURl());
        App().Pages().Forms_Page().EnterfirstName();
        App().Pages().Forms_Page().EnterLastName();
        App().Pages().Forms_Page().EnterEmail();
        App().Pages().Forms_Page().clickMale();
        App().Pages().Forms_Page().EnterUserNumber();
        App().Pages().Forms_Page().EnterDateOfBirt();
        //App().Pages().Forms_Page().EnterSubjects();
        App().Pages().Forms_Page().HobbieSportAndMusic();
        App().Pages().Forms_Page().uploadDocs();
        App().Pages().Forms_Page().EnterCurrentAddress();
        App().Pages().Forms_Page().EnterState();
        App().Pages().Forms_Page().ClickSubmitButton();




    }





}
