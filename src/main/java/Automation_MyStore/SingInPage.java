package Automation_MyStore;

import org.openqa.selenium.By;

public class SingInPage extends Utils {

    LoadProps loadProps = new LoadProps();

    private By _email = By.xpath("//input[@id='email_create']");
    private By _createaccount = By.xpath("//form[@id='create-account_form']//span[1]");

public void createaccount(){
    enterText(_email,LongTimeStamp()+loadProps.getProperty("email"));}

    public  void clickoncreateaccount(){
    clickElementBy(_createaccount);
}

}
