package selenium.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.google.pages.LoginUserPage;


/**
 * Created by Kravchenko Pavel on 09.05.2015.
 */
public class LoginUserTest {

    WebDriver driver;
    LoginUserPage objLogin;

    @Test
    public void LoginUserTestIncorrect(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLoginAuth");
        objLogin = new LoginUserPage(driver);
        objLogin.loginUser("rrrooopppopop", "Nevajno");
        Assert.assertTrue(objLogin.getResult().contains("Неверное имя пользователя или пароль."));
        driver.quit();
    }

    @Test
    public void LoginUserTestCorrect(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLoginAuth");
        objLogin = new LoginUserPage(driver);
        objLogin.loginUser("rrrooopppopop1111ku", "Nevajnoltcznmhfp");
        Assert.assertTrue(objLogin.getResult2().contains("Настройки аккаунта"));
        driver.quit();
    }
}
