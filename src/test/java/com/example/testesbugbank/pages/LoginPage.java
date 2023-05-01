package com.example.testesbugbank.pages;

import com.example.testesbugbank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By emailInput = By.xpath("//*[@id='__next']/div/div[2]/div/div[1]/form/div[1]/input");
    private final By passwordInput = By.xpath("//*[@id='__next']/div/div[2]/div/div[1]/form/div[2]/div/input");
    private final By loginButton = By.xpath("//*[@id='__next']/div/div[2]/div/div[1]/form/div[3]/button[1]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        write(emailInput, email);
    }

    public void setPassword(String password) {
        write(passwordInput, password);
    }

    public void clickLogin() {
        click(loginButton);
    }
}
