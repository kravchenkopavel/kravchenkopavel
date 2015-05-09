package selenium.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.google.pages.PageLoginUser;


/**
 * Created by Kravchenko Pavel on 09.05.2015.
 */
public class TestLoginUser {

    WebDriver driver;
    PageLoginUser objLogin;

    @Test
    public void TestLoginUserIncorrect(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLoginAuth");
        objLogin = new PageLoginUser(driver);
        objLogin.loginUser("rrrooopppopop", "Nevajno");
        Assert.assertTrue(objLogin.getResult().contains("Неверное имя пользователя или пароль."));
        driver.quit();
    }

    @Test
    public void TestLoginUserCorrect(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLoginAuth");
        objLogin = new PageLoginUser(driver);
        objLogin.loginUser("rrrooopppopop1111ku", "Nevajnoltcznmhfp");
        Assert.assertTrue(objLogin.getResult2().contains("Настройки аккаунта"));
        driver.quit();
    }
}
