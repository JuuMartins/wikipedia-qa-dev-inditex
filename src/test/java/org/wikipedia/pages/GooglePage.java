package org.wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.wikipedia.commons.Constants.Elements.*;

public class GooglePage extends BasePage {

    public GooglePage(WebDriver browser) {
        super(browser);
    }

    public void accessGoogle() {
        browser.get("https://google.com/");
        browser.findElement(ACCEPTCOOKIESBTN).click();
    }
    public void googleSearch() {
        browser.findElement(SEARCHFIELD).sendKeys("automatización");
        browser.findElement(GOOGLESEARCHBTN).click();
        browser.findElement(WIKIPAGELINK).click();
    }
}
