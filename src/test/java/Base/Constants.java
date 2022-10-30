package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.PanelUI;
import java.io.File;

public class Constants {
    public static final String CHROMEDRIVER_PATH = "D:\\Data\\Users\\coral-ha\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";


    // constants for registration page
    public static final By NAME_FIELD = By.cssSelector("input[placeholder='שם פרטי']");
    public static final By EMAIL_FIELD = By.cssSelector("input[placeholder='מייל']");
    public  static final By PASSWORD_FIELD = By.cssSelector("input[placeholder='סיסמה']");
    public  static final By PASSWORD_VALIDATION_FIELD = By.cssSelector("input[placeholder='אימות סיסמה']");
    public  static final By AGREEMENT_RADIO_BUTTON = By.cssSelector("circle.fill");
    public static final By REGISTRATION_BLOCK_ID = By.cssSelector("form[class='ember-view']");

    public  static final By LOGIN_ERROR=By.className("login-error");
    // constants for Homescreen page
   public static final By LIST_MENUS = By.className("dropdown");

   // Constants for pickgift page
    public static String CHOOSE_GIFT_SCREEN_URL = "https://buyme.co.il/search?budget=3&category=359&region=12";
    public  static final By GIFT_CHOOSEN = By.xpath("//a[@href='https://buyme.co.il/supplier/1335655?budget=3&category=359&query=&region=12']");

    //constants for sendGift page
    public static  final By ENTER_SUM=By.xpath("//input[@placeholder='הכנס סכום']");
    public static  final By PRESS_CHOICE=By.xpath("//button[@type='submit']");
    public static final By SOMEONE_ELSE= By.xpath("//div[@gtm='למישהו אחר']");
    public static final By RECIVER=By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']");

    public static final By FROM_WHO = By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']");
    public static final By BLEESING = By.xpath("//textarea[@rows='4']");

    public static final By CHOOSE_WHEN = By.xpath("//div[@gtm='עכשיו']");

    public static final By PRINT= By.xpath("//svg[@gtm='method-print']");
    public static final By PRESS_CONTINUE=By.xpath("//button[@gtm='המשך']");
    public static final By PRESS_CONTINUE_PAY=By.xpath("//svg[@gtm='method-sms']");
    public static final String SUM="200";
    public static final String WHO_RECIVE="Rotem";

    public static final String SENDER="Coral";
    public static  final String BLESS="שתדעי רק נחת מהרך הנולד! באהבה רבה קורל";




}


