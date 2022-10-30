package Screens;//import jdk.incubator.vector.ByteVector;
import Base.BasePage;
import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.ByAngular;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeScreen extends BasePage {
    private WebDriver driver;

    public HomeScreen(WebDriver driver){
        this.driver=driver;
    }

    public void foundGift(){

      waitForElement(driver,By.cssSelector("form[class='form ember-view'"));
      WebElement test=driver.findElement(By.xpath("//div[@class='selected-name']"));



    }

}
