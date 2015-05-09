package selenium.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kravchenko Pavel on 09.05.2015.
 */
public class LoginUserPage {

    WebDriver driver;

    // fields
    By email = By.name("Email");
    By passwd = By.name("Passwd");
    By submitbutton = By.name("signIn");
    By persistentcookieless = By.name("PersistentCookie");
    By signupidv = By.id("errormsg_0_Passwd");
    By signupidv2 = By.cssSelector(".xd");


    //driver
    public LoginUserPage(WebDriver driver){this.driver = driver;}

    //set email in textbox
    public void setEmail(String stremail){driver.findElement(email).sendKeys(stremail);}

    //set passwd in textbox
    public void setPasswd(String strpasswd){driver.findElement(passwd).sendKeys(strpasswd);}

    //click submitbutton
    public void setPersistentcookieless(){driver.findElement(persistentcookieless).click();}

    //click submitbutton
    public void setSubmitbutton(){driver.findElement(submitbutton).click();}

    //return the text after click submitbutton
    public String getResult(){return driver.findElement(signupidv).getText();}
    public String getResult2(){return driver.findElement(signupidv2).getText();}

    //this method use in the test LoginUserTest*
    public void loginUser(String stremail, String strpasswd){
        this.setEmail(stremail);            //fill email
        this.setPasswd(strpasswd);          //fill passwd
        this.setPersistentcookieless();     //click persistentcookieless
        this.setSubmitbutton();             //click submitbutton
    }







}
