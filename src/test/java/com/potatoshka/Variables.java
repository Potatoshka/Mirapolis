package com.potatoshka;

public class Variables {
    //Locators
    public static final String url = "https://lmslite47vr.demo.mirapolis.ru/mira";
    public static final String loginInputLocator="//input[@name='user']";
    public static final String passwordInputLocator="//input[@name='password']";
    public static final String enterButtonLocator = "//button[@id='button_submit_login_form']";
    public static final String employerAvatar="//div[@class='avatar-full-name']";
    public static final String restorePassLink="//a[@class='mira-default-login-page-link']";
    public static final String inputRestoreField="//input[@name='loginOrEmail']";
    // Settings
    public static String login = "fominaelena";
    public static String password ="1P73BP4Z";
    public static int cookies =1; //1-delete cookies 2-store cookies
    public static String popUpText="Неверные данные для авторизации.";
    public static String popUpText2="Неверные данные для авторизации";
    public static String Browser="Chrome"; //Set "Opera" for Opera browser tests
    public static int Wait = 5;
}
