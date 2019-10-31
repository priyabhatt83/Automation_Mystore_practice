package Automation_MyStore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class WomenPage extends Utils {

    private By _women = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
    private By _dressess = By.xpath("//body[@id='category']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='left_column']/div[@id='categories_block_left']/div[@class='block_content']/ul[@class='tree dynamized']/li[@class='last']/a[1]");


    public void clickOnWomen(){
        clickElementBy(_women);
    }
    public void clickOnDressess(){
        clickElementBy(_dressess);

    }
    public void scrollPage(){
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
    }
}
