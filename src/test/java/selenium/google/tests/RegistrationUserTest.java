package selenium.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.google.pages.RegistrationUserPage;
/**
 * Created by Kravchenko Pavel on 09.05.2015.
 */
public class RegistrationUserTest {
    WebDriver driver;
    RegistrationUserPage objRegistration;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/SignUp");
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

    @Test
    public void fullRightRegistrationTest(){
        objRegistration = new RegistrationUserPage(driver);
        objRegistration.registrationUser("Pavel", "Nevajno", "rrrooopppopop", "hj,jnsikt,fns", "hj,jnsikt,fns",
                "23", "7", "1990", true);
        Assert.assertTrue(objRegistration.getResult().contains("Подтвердите аккаунт"));
    }
}
