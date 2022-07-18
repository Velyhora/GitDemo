package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.Login;

public class FBHomePage {

    Logger logger = Logger.getLogger(FBHomePage.class);
        public FBHomePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(name = "login")
    WebElement loginButton;

    public void loginToFB(String email, String password) {
        logger.info("Logging in to Facebook");
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
