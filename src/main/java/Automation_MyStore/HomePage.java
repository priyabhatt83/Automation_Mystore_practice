package Automation_MyStore;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _signin = By.xpath("//a[@class='login']");

    public void signin(){
        clickElementBy(_signin);
    }
}
