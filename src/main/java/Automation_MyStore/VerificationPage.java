package Automation_MyStore;

import org.junit.Assert;
import org.openqa.selenium.By;

public class VerificationPage extends Utils {

    LoadProps loadProps = new LoadProps();

    public void homepage()
    {
        asserCurrentURL("http://automationpractice.com");
    }
    public void userShouldbeOnAccountPage(){
        asserCurrentURL("http://automationpractice.com/index.php?controller=my-account");

    }
}
