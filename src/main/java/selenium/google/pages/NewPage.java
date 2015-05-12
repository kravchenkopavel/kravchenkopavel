package selenium.google.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Created by Admin on 12.05.15.
 */
public class NewPage {

    WebDriver driver;

    // fields
    //By email = By.name("Email");
    //By passwd = By.name("Passwd");
    //By submitbutton = By.name("signIn");
    //By persistentcookieless = By.name("PersistentCookie");
    //By signupidv = By.id("errormsg_0_Passwd");
    //By signupidv2 = By.cssSelector(".xd");
    By menu0 = By.xpath(".//*[@id='gbwa']/div[1]/a");
    By menu = By.xpath(".//*[@id='gb78']/span[2]");


    //driver
    public NewPage(WebDriver driver){this.driver = driver;}

    public String getText(){
        driver.findElement(menu0).click();
        System.out.println(driver.findElement(menu).getText());
        return driver.findElement(menu).getText();
    }
    //public String getText1(){return driver.findElement(menu).getText();}
}
