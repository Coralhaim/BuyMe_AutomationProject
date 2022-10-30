import Base.Constants;
import Base.DriverSingleton;
import Screens.HomeScreen;
import Screens.IntroRegisScreen;
import Screens.PickBuisnessScreen;
import Screens.SendGiftScreen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainTestPage {

    public static WebDriver driver;


    @BeforeClass
    public static void runBeforeTest(){
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver=new DriverSingleton().getDriverInstance();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://buyme.co.il/");

    }

    @Test
    public void mainTest(){
        IntroRegisScreen sign=new IntroRegisScreen(driver);
        String myName="coral";
        String myEmail="coraltest65@gmail.com";
        String myPass="Coral1234";
        String myConfirmPass="Coral1234";

        sign.signIn(myName,myEmail,myPass,myConfirmPass);

        HomeScreen searchGift=new HomeScreen(driver);
        searchGift.foundGift();

        PickBuisnessScreen pick=new PickBuisnessScreen(driver);
        pick.chooseGift();

        SendGiftScreen sendgift=new SendGiftScreen(driver);
        sendgift.sendGift();

    }

    @AfterClass
    public static void runAfterTest(){

    }


}
