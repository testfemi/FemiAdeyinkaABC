package in.demoqa.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
    WebDriver driver;

    public FlowLib (WebDriver driver) {
        this.driver = driver;

    }

    public void navigateToUrl(String url) {

        this.driver.get(url);

    }



}
