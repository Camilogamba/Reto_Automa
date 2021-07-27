package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class RegisterPage {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to join today").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST = Target.the("where do we write the firstName").located(By.id("firstName"));
    public static final Target INPUT_LAST = Target.the("where do we write the lastName").located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("here the month is selected").located(By.cssSelector("#birthMonth > option:nth-child(7)"));
    public static final Target BIRTH_DAY = Target.the("here the day is selected").located(By.cssSelector("#birthDay > option:nth-child(10)"));
    public static final Target BIRTH_YEAR = Target.the("here the year is selected").located(By.cssSelector("#birthYear > option:nth-child(10)"));
    public static final Target NEXT1_BUTTON = Target.the("button second that shows us the form to join today").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target NEXT2_BUTTON = Target.the("button third that shows us the form to join today").located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
    public static final Target MOBILE_DEVICE = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(1) > div.ui-select-box > div"));
    public static final Target MOBILE_DEVICE2 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(1) > div.ui-select-box > div > input"));
    public static final Target MOBILE_DEVICE3 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(1) > div.ui-select-box > div > input"));
    public static final Target MOBILE_MODEL = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(2) > div.ui-select-box > div"));
    public static final Target MOBILE_MODEL2 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(2) > div.ui-select-box > div > input"));
    public static final Target MOBILE_MODEL3 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(2) > div.ui-select-box > div > input"));
    public static final Target MOBILE_SYSTEM = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(3) > div.ui-select-box > div"));
    public static final Target MOBILE_SYSTEM2 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(3) > div.ui-select-box > div > input"));
    public static final Target MOBILE_SYSTEM3 = Target.the("here the day is selected").located(By.cssSelector("#mobile-device > div:nth-child(3) > div.ui-select-box > div > input"));
    public static final Target NEXT3_BUTTON = Target.the("button third that shows us the form to join today").located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
    public static final Target INPUT_PASS = Target.the("where do we write the pass").located(By.xpath("//[@id='password']"));
    public static final Target INPUT_PASSR = Target.the("where do we write the confirm pass").located(By.xpath("//[@id='confirmPassword']"));






}
