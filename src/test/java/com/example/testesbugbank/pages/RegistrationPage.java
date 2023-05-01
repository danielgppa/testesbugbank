package com.example.testesbugbank.pages;

import com.example.testesbugbank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

    private final By registerButton = By.xpath("//*[@id='__next']/div/div[2]/div/div[1]/form/div[3]/button[2]");
    private final By emailField = By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[2]/input");
    private final By nameField = By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[3]/input");
    private final By passwordField = By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[4]/div/input");
    private final By confirmPasswordField = By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/div[5]/div/input");
    private final By createAccountWithBalanceToggle = By.xpath("//*[@id='toggleAddBalance']");
    private final By submitButton = By.xpath("//*[@id='__next']/div/div[2]/div/div[2]/form/button");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        click(registerButton);
    }

    public void setEmail(String email) {
        write(emailField, email);
    }

    public void setName(String name) {
        write(nameField, name);
    }

    public void setPassword(String password) {
        write(passwordField, password);
    }

    public void setConfirmPassword(String confirmPassword) {
        write(confirmPasswordField, confirmPassword);
    }

    public void toggleCreateAccountWithBalance() {
        click(createAccountWithBalanceToggle);
    }

    public void clickSubmit() {
        click(submitButton);
    }
}
