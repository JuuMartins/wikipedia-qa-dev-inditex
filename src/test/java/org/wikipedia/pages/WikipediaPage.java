package org.wikipedia.pages;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import static org.wikipedia.commons.Constants.Elements.*;

public class WikipediaPage extends BasePage {

    public WikipediaPage(WebDriver browser) {
        super(browser);
    }

    public void findFirstYearAutomation() {
        String text = browser.findElement(FIRSTPARAGRAPHSTORY).getText();
        Assertions.assertTrue(containsWord(text, "270"));
    }

    public boolean containsWord(String text, String word) {
        if (text == null || word == null) {
            return false;
        }
        return text.contains(word);
    }

    public void screenshotPage() throws IOException {
        TakesScreenshot shot = (TakesScreenshot) browser;
        File file = shot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshot.png");
        FileUtils.copyFile(file, destFile);
    }

    public void closePage() {
        browser.close();
    }
}
