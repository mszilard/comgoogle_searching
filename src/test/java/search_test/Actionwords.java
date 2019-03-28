package search_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Actionwords {


    private WebDriver driver;

    Actionwords() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void iOpenUrl(String url) {
        driver.get(url);

    }

    public void iSearchForVga(String vga) {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys(vga);
        element.submit();

    }

    public void aLinkToStoreLinkIsShownInTheResults(String storeLink) {
        driver.get(storeLink);
    }
}