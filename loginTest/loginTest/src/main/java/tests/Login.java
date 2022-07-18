package tests;

import common_utils.CommonUtilities;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FBHomePage;
import pages.LoginToFBPage;

import java.io.File;

import static common_utils.Constants.EXPECTED_ERROR_MSG;
import static common_utils.Constants.FB_URL;

public class Login {

    WebDriver driver;
    FBHomePage fbHomePage;
    LoginToFBPage loginToFBPage;
    Logger logger = Logger.getLogger(Login.class);

    @BeforeMethod
    public void setup() {

        logger.info("Setup tests");
        driver = CommonUtilities.initiateDriver();
        driver.navigate().to(FB_URL);
        fbHomePage = new FBHomePage(driver);
        loginToFBPage = new LoginToFBPage(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        logger.info("Clean up the state");
        if (!result.isSuccess()) {
            logger.error("Test failed, taking screenshot");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        }

        logger.info("Quitting driver");
        driver.quit();
    }

    @Test
    public void loginNegativeTest() {
        Assert.assertEquals(driver.getCurrentUrl(), FB_URL);
        fbHomePage.loginToFB("lyudmilka86@hotmail.com", "invalidPassword");
        String actualErrorMsg = loginToFBPage.errorMsg.getText();
        Assert.assertEquals(actualErrorMsg, EXPECTED_ERROR_MSG);
    }
}
