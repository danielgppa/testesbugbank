package com.example.testesbugbank.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverFactory.getDriver();
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void write(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }

}
