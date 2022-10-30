package Screens;//import jdk.incubator.vector.ByteVector;
import Base.BasePage;
import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.ByAngular;
import org.testng.Assert;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PickBuisnessScreen extends BasePage {
    private WebDriver driver;

    public PickBuisnessScreen(WebDriver driver){
        this.driver=driver;
    }

    public  void  chooseGift(){
        assertUrl();
        pickGift();

    }

    public void assertUrl() {
        driver.get("https://buyme.co.il/search?budget=3&category=359&region=12");

        waitForElement(driver,By.className("application-main"));
        try {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, Constants.CHOOSE_GIFT_SCREEN_URL);
        } catch (Exception e) {
            System.out.println("AssertionError");
        }
    }

      public void pickGift(){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            clickElement(Constants.GIFT_CHOOSEN);
      }





}
