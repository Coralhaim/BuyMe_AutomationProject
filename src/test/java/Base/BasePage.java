package Base;

import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;



public class BasePage {

    public void clickElement(By locator) {
        getWebElement(locator).click();
    }

    public void sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
    }

    private WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public void waitForElement(WebDriver driver, By selector){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selector));
        } catch (Exception e) {
            System.out.println("add screenshot");
        }

    }

    //This method will make ScreenShot
    public static String takeScreenShot(String imagePath,WebElement driver){
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File screenShotFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile=new File(imagePath+".jpg");

        try{

            FileUtils.copyFile(screenShotFile,destinationFile);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return imagePath+".jpg";

    }

}
