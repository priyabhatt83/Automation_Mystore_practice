package Automation_MyStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _gender = By.xpath("//div[@class='clearfix']//div[2]//label[1]");
    private By _firstname = By.xpath("//input[@id='customer_firstname']");
    private By _lastname = By.xpath("//input[@id='customer_lastname']");
    private By _password = By.xpath("//input[@id='passwd']");
   // private By _DayofDOB = By.xpath("//select[@id='days']");
   // private By _monthofDOB = By.xpath("//select[@id='months']");
    //private By _yearofDOB = By.xpath("//select[@id='years']");
    private By _signonbox = By.xpath("//input[@id='newsletter']");
    private By _offerbox = By.xpath("//input[@id='optin']");
    private By _firstlineaddress = By.xpath("//input[@id='address1']");
    private By _city = By.xpath("//input[@id='city']");
    private By _state = By.xpath("//select[@id='id_state']");
    private By _zipcode = By.xpath("//input[@id='postcode']");
    private By _country= By.xpath("//select[@id='id_country']");
    private By _moblilenumber= By.xpath("//input[@id='phone_mobile']");
    private By _registerbtn = By.xpath("//span[contains(text(),'Register')]");

public void userEntersAllDetails(){
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    clickElementBy(_gender);
    enterText(_firstname,loadProps.getProperty("firstname"));
    enterText(_lastname,loadProps.getProperty("lastname"));
    enterText(_password,loadProps.getProperty("password"));
   // selectByIndex(_DayofDOB,1);
   // clickElementBy(_monthofDOB);
//    selectByText(_monthofDOB,"January");
  //  selectByIndex(_yearofDOB,2000);
    clickElementBy(_signonbox);
    clickElementBy(_offerbox);
    enterText(_firstlineaddress,loadProps.getProperty("firstlineofaddress"));
    enterText(_city,loadProps.getProperty("city"));
    enterText(_state,loadProps.getProperty("state"));
    enterText(_zipcode,loadProps.getProperty("zipcode"));
    enterText(_country,loadProps.getProperty("country"));
    enterText(_moblilenumber,loadProps.getProperty("mobile"));
    clickElementBy(_registerbtn);
}



}
