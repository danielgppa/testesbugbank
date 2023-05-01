package com.example.testesbugbank.pages;

import com.example.testesbugbank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By logoutButton = By.xpath("//*[@id='__next']/div/div[1]/div");
    private final By transferButton = By.xpath("//*[@id='btn-TRANSFERÊNCIA']");
    private final By paymentsButton = By.xpath("//*[@id='btn-PAGAMENTOS']");
    private final By statementButton = By.xpath("//*[@id='btn-EXTRATO']");
    private final By withdrawalButton = By.xpath("//*[@id='btn-SAQUE']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogout() {
        click(logoutButton);
    }

    public void clickTransfer() {
        click(transferButton);
    }

    public void clickPayments() {
        click(paymentsButton);
    }

    public void clickStatement() {
        click(statementButton);
    }

    public void clickWithdrawal() {
        click(withdrawalButton);
    }
}
