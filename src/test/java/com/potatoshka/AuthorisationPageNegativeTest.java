package com.potatoshka;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.potatoshka.Variables.*;



public class AuthorisationPageNegativeTest extends BaseTest {
    @Test
    public void emptyInputTest(){ //Test if no data entered
        goTo(url);
        click(enterButtonLocator);
        Assertions.assertEquals(popUpText, readPoPupText());
    }
    @Test
    public void spacesTest(){ //Test if only spaces entered
        goTo(url);
        inputField(loginInputLocator," ");
        inputField(passwordInputLocator," ");
        click(enterButtonLocator);
        Assertions.assertEquals(popUpText, readPoPupText());
    }
    @Test
    public void spacesPlusCorrectData(){ //Test if correct authorisation entered with spaces
        goTo(url);
        inputField(loginInputLocator," "+login);
        inputField(passwordInputLocator," "+password);
        click(enterButtonLocator);
        Assertions.assertEquals(popUpText, readPoPupText());
    }
    @Test
    public void correctLoginButInCorrectPass(){ //Test if correct login but incorrect password was entered
        goTo(url);
        inputField(loginInputLocator,login);
        inputField(passwordInputLocator,"wrongpass");
        click(enterButtonLocator);
        Assertions.assertEquals(popUpText2, readPoPupText());
    }
    @AfterAll
    public static void quit(){
        close();
    }

}
