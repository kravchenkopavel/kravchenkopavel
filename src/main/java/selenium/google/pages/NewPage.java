package selenium.google.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Admin on 12.05.15.
 */
public class NewPage {

    WebDriver driver;

    // fields

    @FindBy(xpath = ".//*[@id='gbwa']/div[1]/a")//(how = How.XPATH, using = ".//*[@id='gbwa']/div[1]/a")
            public WebElement menu0;
    //By menu0 = By.xpath(".//*[@id='gbwa']/div[1]/a");
    //By menu = By.xpath(".//*[@id='gb78']/span[2]");
    @FindBy(xpath = ".//*[@id='gb78']/span[2]")//(how = How.XPATH, using = ".//*[@id='gb78']/span[2]")
            public WebElement menu;

    //driver
    public NewPage(WebDriver driver){this.driver = driver;}

    public String getTex() throws InterruptedException {
        //@FindBy(how= How.XPATH, using = menu0);   //(menu0);
        menu0.click();
        //menu0.wait(1000);
        System.out.println(menu.getText());
        return menu.getText();
    }
    //public String getText1(){return driver.findElement(menu).getText();}
}
