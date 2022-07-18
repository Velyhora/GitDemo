package common_utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import tests.Login;

import java.util.concurrent.TimeUnit;

public class CommonUtilities {
    private static Logger logger = Logger.getLogger(CommonUtilities.class);

    public static WebDriver initiateDriver() {
        logger.debug("Setting up the chrome browser");

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("incognito", "true");
        WebDriver chrome = new ChromeDriver(chromeOptions);
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return chrome;
    }
}
