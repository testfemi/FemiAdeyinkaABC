package in.demoqaTest._TestCases;

import in.demoqa.lib.AppLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class AbstractBaseTest {

    WebDriver driver;
    private AppLib app;

    @Parameters({"browser", "driverexe"})
    @BeforeMethod(alwaysRun = true)

    public void setUp(@Optional("Chrome") String browser,
                      @Optional("C:\\Users\\Fmbase\\Desktop\\IntelliJ\\drivers\\chromedriver.exe") String exe) throws Exception {

        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", exe);
            driver = new ChromeDriver();


        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", exe);
            driver = new FirefoxDriver();

        }

        // Global Scopes
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        app = new AppLib(driver);

    }
/*        @AfterMethod(alwaysRun = true)
        public void tearDown() {
            driver.close();
        }*/

        public AppLib App() {
            return app;
        }

    }




