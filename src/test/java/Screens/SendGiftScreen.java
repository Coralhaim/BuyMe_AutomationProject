package Screens;//import jdk.incubator.vector.ByteVector;
import Base.BasePage;
import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.ByAngular;
import org.testng.Assert;

import java.util.List;


public class SendGiftScreen extends BasePage{

    private WebDriver driver;

    public SendGiftScreen(WebDriver driver){
        this.driver=driver;
    };

    public void sendGift(){

        waitForElement(driver,By.className("gift-card-img"));
        pressPrice();
        waitForElement(driver,By.className("application-main"));
        enterDetails();
        whenSendDeatails();

    }

    public void pressPrice(){
        WebElement sum= driver.findElement(Constants.ENTER_SUM);
        sum.sendKeys(Constants.SUM);
        WebElement pressChoice=driver.findElement(Constants.PRESS_CHOICE);
        Actions newAct=new Actions(driver);
        newAct.doubleClick(pressChoice).perform();
    }

    public void enterDetails(){
        WebElement sendToElse= driver.findElement(Constants.SOMEONE_ELSE);
        sendToElse.click();

        WebElement enterRecive= driver.findElement(Constants.RECIVER);
        enterRecive.sendKeys(Constants.WHO_RECIVE);

//         Select eventSelect = new Select(driver.findElement(By.className("dropdown")));
//         eventSelect.selectByValue("12");

        WebElement bless=driver.findElement(Constants.BLEESING);
        bless.clear();
        bless.sendKeys(Constants.BLESS);
        clickElement(Constants.PRESS_CONTINUE);


    }

    public  void whenSendDeatails(){
        clickElement(Constants.CHOOSE_WHEN);
//        clickElement(Constants.PRINT);
        WebElement fromField=driver.findElement(Constants.FROM_WHO);
        fromField.sendKeys(Constants.SENDER);
    }


}
