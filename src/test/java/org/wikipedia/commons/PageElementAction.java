package org.wikipedia.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageElementAction extends Page {

    WebDriver driver;
    public PageElementAction() {
    }

    private void clickOn(By loc) {
        new WebDriverWait(driver, Duration.ofSeconds('5'))
                .until(ExpectedConditions.elementToBeClickable(loc)).click();
    }
}
