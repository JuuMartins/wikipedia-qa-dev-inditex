package org.wikipedia.commons;

import org.openqa.selenium.By;

public final class Constants {

    public Constants() {}

    public static final class Elements {

        public static final By ACCEPTCOOKIESBTN = By.id("L2AGLb");
        public static final By SEARCHFIELD = By.className("gLFyf");
        public static final By GOOGLESEARCHBTN = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']");
        public static final By WIKIPAGELINK = By.xpath("//h3[text()=\"Automatización - Wikipedia, la enciclopedia libre\"]");
        public static final By FIRSTPARAGRAPHSTORY = By.xpath("//p[a[contains(@href, 'Egipto')]]");
    }
}
