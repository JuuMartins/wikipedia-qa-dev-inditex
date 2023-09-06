package org.wikipedia.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.wikipedia.pages.GooglePage;
import org.wikipedia.pages.WikipediaPage;

import java.io.IOException;

public class FindWikipediaTest {

    @Test
    public void testFindWikipediaWebsite() throws IOException {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriver browser = new ChromeDriver();
        GooglePage googlePage = new GooglePage(browser);
        WikipediaPage wikipediaPage = new WikipediaPage(browser);
        googlePage.accessGoogle();
        googlePage.googleSearch();
        wikipediaPage.findFirstYearAutomation();
        wikipediaPage.screenshotPage();
        wikipediaPage.closePage();
    }
}
