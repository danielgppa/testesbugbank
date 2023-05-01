package com.example.testesbugbank.pages;

import com.example.testesbugbank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage extends BasePage {

    private final By backButton = By.xpath("//*[@id='__next']/div/div[2]/div");
    private final By accountNumberInput = By.xpath("//*[@id='__next']/div/div[3]/form/div[1]/div[1]/input");
    private final By accountDigitInput = By.xpath("//*[@id='__next']/div/div[3]/form/div[1]/div[2]/input");
    private final By transferAmountInput = By.xpath("//*[@id='__next']/div/div[3]/form/div[2]/input");
    private final By descriptionInput = By.xpath("//*[@id='__next']/div/div[3]/form/div[3]/input");
    private final By transferNowButton = By.xpath("//*[@id='__next']/div/div[3]/form/button");

    public TransferPage(WebDriver driver) {
        super(driver);
    }

    public void clickBack() {
        click(backButton);
    }

    public void enterAccountNumber(String accountNumber) {
        write(accountNumberInput, accountNumber);
    }

    public void enterAccountDigit(String accountDigit) {
        write(accountDigitInput, accountDigit);
    }

    public void enterTransferAmount(String amount) {
        write(transferAmountInput, amount);
    }

    public void enterDescription(String description) {
        write(descriptionInput, description);
    }

    public void clickTransferNow() {
        click(transferNowButton);
    }
}
