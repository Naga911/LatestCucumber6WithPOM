package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class eServiceRegistrationPage {
    WebDriver driver;

    public eServiceRegistrationPage(WebDriver driver)
    {
        this.driver = driver;

    }
    private By Register = By.xpath("//a[normalize-space()='Register']");
    private By Names = By.xpath("//input[@placeholder='Name']");
    private By surnames = By.xpath("//input[@placeholder='Surname']");
    private By emailaddress = By.xpath("//input[@placeholder='Email address']");
    private By username = By.xpath("//input[contains(@placeholder,'User name')]");
    private By passwords = By.xpath("//input[@placeholder='Password']");
    private By registerBtn = By.xpath("//div[@class='col-4 ng-tns-c184-2']");
    private By registerBtn1 = By.xpath("//a[normalize-space()='Register']");



    public void fillContactUsForm(String name, String surname, String emailAddress, String userName,String password) {
        driver.findElement(Names).sendKeys(name);
        driver.findElement(surnames).sendKeys(surname);
        driver.findElement(emailaddress).sendKeys(emailAddress);
        driver.findElement(username).sendKeys(userName);
        driver.findElement(passwords).sendKeys(password);
    }

        public void clickRegisterBtn()
        {
            driver.findElement(registerBtn).click();
        }
    public void clickRegisterBtn1()
    {
        driver.findElement(registerBtn1).click();
    }
    }


