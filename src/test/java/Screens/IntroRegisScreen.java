package Screens;//import jdk.incubator.vector.ByteVector;
import Base.BasePage;
import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.ByAngular;
import org.testng.Assert;


public class IntroRegisScreen extends BasePage {

    private WebDriver driver;

    public IntroRegisScreen(WebDriver driver){
        this.driver=driver;
    }


    public void signIn(String myName, String myEmail, String myPass, String myConfirmPass) {
       waitForElement(driver,By.className("notSigned"));
       clickElement(By.className("notSigned"));
       waitForElement(driver,By.className("text-link"));
       clickElement(By.className("text-link"));

        try{
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".option.oldschool")));
            reggisterDetails(myName, myEmail, myPass, myConfirmPass);
        }catch (Exception e){
            System.out.println("add screenshot");
        }
    }

    // this method enter register details and assert equal
    public void reggisterDetails(String myName, String myEmail, String myPass, String myConfirmPass) {
        boolean flag=true;
        try {
            driver.findElement(Constants.NAME_FIELD).sendKeys(myName);
            driver.findElement(Constants.EMAIL_FIELD).sendKeys(myEmail);
            driver.findElement(Constants.PASSWORD_FIELD).sendKeys(myPass);
            driver.findElement(Constants.PASSWORD_VALIDATION_FIELD).sendKeys(myConfirmPass);



        }catch (Exception e){
            System.out.println("fail to enter deatails");
            flag=false;
        }finally {
            if(flag){
                driver.findElement(Constants.AGREEMENT_RADIO_BUTTON).click();
                Assert.assertEquals(driver.findElement(Constants.NAME_FIELD).getAttribute("value"),myName);
                Assert.assertEquals(driver.findElement(Constants.EMAIL_FIELD).getAttribute("value"),myEmail);
                driver.findElement(Constants.REGISTRATION_BLOCK_ID).submit();
                WebElement logError= driver.findElement(Constants.LOGIN_ERROR);
                if(logError.getAttribute("value")!= "דוא\"ל זה כבר קיים במערכת."){
                    takeScreenShot("failregiister",driver.findElement(By.className("option oldschool")));
                    clickElement(By.className("close-btn"));
                }

            }



        }
    }



}
