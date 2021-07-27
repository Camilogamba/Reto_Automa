package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;
import org.seleniumhq.jetty9.util.security.Password;
import userinterface.RegisterPage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Register implements Task {
    private String strFirstNa;
    private String strLastNa;
    private String strMail;
    private String strModel;
    private String strSystem;
    private String strDevice;
    private String strPass;

    public Register(String strFirstNa, String strLastNa, String strMail, String strModel, String strSystem, String strDevice, String strPass ){
        this.strFirstNa = strFirstNa;
        this.strLastNa = strLastNa;
        this.strMail = strMail;
        this.strModel = strModel;
        this.strSystem = strSystem;
        this.strDevice = strDevice;
        this.strPass = strPass;
    }
    public static Register onThePage(String strFirstNa, String strLastNa, String strMail, String strModel, String strSystem, String strDevice, String strPass) {
        return Tasks.instrumented(Register.class,strFirstNa,strLastNa, strMail, strModel, strSystem, strDevice, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.REGISTER_BUTTON),
        Enter.theValue(strFirstNa).into(RegisterPage.INPUT_FIRST),
        Enter.theValue(strLastNa).into(RegisterPage.INPUT_LAST),
        Enter.theValue(strMail).into(RegisterPage.INPUT_MAIL));
        actor.attemptsTo(Click.on(RegisterPage.BIRTH_MONTH));
        actor.attemptsTo(Click.on(RegisterPage.BIRTH_DAY));
        actor.attemptsTo(Click.on(RegisterPage.BIRTH_YEAR));
        actor.attemptsTo(Click.on(RegisterPage.NEXT1_BUTTON));
        actor.attemptsTo(Click.on(RegisterPage.NEXT2_BUTTON));
        actor.attemptsTo(Click.on(RegisterPage.MOBILE_DEVICE),
        Enter.theValue(strDevice).into(RegisterPage.MOBILE_DEVICE2),
        Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_DEVICE3));
        actor.attemptsTo(Click.on(RegisterPage.MOBILE_MODEL),
        Enter.theValue(strModel).into(RegisterPage.MOBILE_MODEL2),
        Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_MODEL3));
        actor.attemptsTo(Click.on(RegisterPage.MOBILE_SYSTEM),
        Enter.theValue(strSystem).into(RegisterPage.MOBILE_SYSTEM2),
        Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_SYSTEM3));
        actor.attemptsTo(Click.on(RegisterPage.NEXT3_BUTTON));
        Enter.theValue(strPass).into(RegisterPage.INPUT_PASS);
        Enter.theValue(strPass).into(RegisterPage.INPUT_PASSR);
    }
}
