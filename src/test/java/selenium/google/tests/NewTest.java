package selenium.google.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.google.pages.NewPage;
/**
 * Created by Admin on 12.05.15.
 */
public class NewTest {

    WebDriver driver;
    NewPage objTest;

    @Test
    public void Test() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.google.ru/?gws_rd=ssl");
        objTest = new NewPage(driver);
        //objTest.loginUser("rrrooopppopop", "Nevajno");
        //objTest.wait(1000);
        objTest.getTex();
        //Assert.assertTrue(objTest.getText().contains("Play"));

        //driver.quit();
    }
}
