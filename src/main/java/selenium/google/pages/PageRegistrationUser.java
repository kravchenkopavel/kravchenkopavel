package selenium.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kravchenko Pavel on 09.05.2015.
 */
public class PageRegistrationUser {

    WebDriver driver;

    // fields
    By firstname = By.name("FirstName");
    By lastname = By.name("LastName");
    By gmailaddress = By.name("GmailAddress");
    By passwd = By.name("Passwd");
    By passwdagain = By.name("PasswdAgain");
    By birthday = By.name("BirthDay");
    By birthmonth = By.cssSelector(".goog-inline-block.goog-flat-menu-button.jfk-select");
    By birthyear = By.name("BirthYear");
    By gender = By.id(":d");
    By capthaskip = By.id("SkipCaptcha");
    By termsofservise = By.id("TermsOfService");
    By submitbutton = By.name("submitbutton");
    By signupidv = By.cssSelector(".redtext");

    //driver
    public PageRegistrationUser(WebDriver driver){this.driver = driver;}

    //set firstname in textbox
    public void setFirstName(String strfirstname){driver.findElement(firstname).sendKeys(strfirstname);}

    //set lastname in textbox
    public void setLastName(String strlastname){driver.findElement(lastname).sendKeys(strlastname);}

    //set gmailaddress in textbox
    public void setGmailaddress(String strgmailaddress){driver.findElement(gmailaddress).sendKeys(strgmailaddress+String.valueOf(Math.random()*10000));}

    //set passwd in textbox
    public void setPasswd(String strpasswd){driver.findElement(passwd).sendKeys(strpasswd);}

    //set passwdagain in textbox
    public void setPasswdagain(String strpasswdagain){driver.findElement(passwdagain).sendKeys(strpasswdagain);}

    //set birthday in textbox
    public void setBirthday(String strbirthday){driver.findElement(birthday).sendKeys(strbirthday);}

    //select birthmonth in listbox
    public void setBirthmonth(String monthnumber){
        driver.findElement(birthmonth).click();
        driver.findElement(By.id(":"+monthnumber)).click();
    }

    //set birthyear in textbox
    public void setBirthyear(String strbirthyear){driver.findElement(birthyear).sendKeys(strbirthyear);}

    //select gender in listbox: true - man, fasle - woman
    public void setGender(Boolean man){
        driver.findElement(gender).click();
        if (man){driver.findElement(By.id(":f")).click();}
        else {driver.findElement(By.id(":e")).click();}
    }
    //set capthaskip
    public void setCapthaskip(){driver.findElement(capthaskip).click();}

    //set allow termsofservise
    public void setTermsofservise(){driver.findElement(termsofservise).click();}

    //click submitbutton
    public void setSubmitbutton(){driver.findElement(submitbutton).click();}

    //return the part of the text's on the page that opens
    public String getResult(){return driver.findElement(signupidv).getText();}

    //this method use in the test RegistrationUserTest
    public void registrationUser(String strfirstname, String strlastname, String strgmailaddress, String strpasswd,
                                 String strpasswdagain, String strbirthday, String monthnumber, String strbirthyear,
                                 Boolean man){
        this.setFirstName(strfirstname);        //fill firstname
        this.setLastName(strlastname);          //fill lastname
        this.setGmailaddress(strgmailaddress);  //fill gmailaddress
        this.setPasswd(strpasswd);              //fill passwd
        this.setPasswdagain(strpasswdagain);    //fill passwdagain
        this.setBirthday(strbirthday);          //fill birthday
        this.setBirthmonth(monthnumber);        //fill monthnumber
        this.setBirthyear(strbirthyear);        //fill strbirthyear
        this.setGender(man);                    //fill gender
        this.setCapthaskip();                   //set capthaskip
        this.setTermsofservise();               //set allow termsofservise
        this.setSubmitbutton();                 //click submitbutton
    }
}
