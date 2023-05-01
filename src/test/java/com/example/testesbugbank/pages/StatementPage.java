package com.example.testesbugbank.pages;

import com.example.testesbugbank.core.BasePage;
import org.openqa.selenium.By;

public class StatementPage extends BasePage {

    private final By textBalanceAvailable = By.xpath("//*[@id=\"textBalanceAvailable\"]");
    private final By transactionHistory = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]");

    public String getBalanceAvailable() {
        return getText(textBalanceAvailable);
    }

    public String getTransactionHistory() {
        return getText(transactionHistory);
    }
}
