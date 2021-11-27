package com.potatoshka;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.potatoshka.Variables.*;

public class AuthorisationPagePositiveTest extends BaseTest {


    @Test
    public void authorizationTest(){ //Correct authorisation test
        goTo(url);
        inputField(loginInputLocator,login);
        inputField(passwordInputLocator,password);
        click(enterButtonLocator);
        Assertions.assertTrue(checkIfElementPresented(employerAvatar));

    }

    @Test
    public void restorePasswordTest(){   //Check "Forget password" link
        goTo(url);
        click(restorePassLink);
        Assertions.assertTrue(checkIfElementPresented(inputRestoreField));


    }

    @Test
    public void authorisationWithEnterTest(){ //Correct authorisation if user presses Enter to submit
        goTo(url);
        inputField(loginInputLocator,login);
        inputField(passwordInputLocator,password+"\n");
        Assertions.assertTrue(checkIfElementPresented(employerAvatar));
    }
    @AfterAll
    public static void quit(){
      close();
    }



}
