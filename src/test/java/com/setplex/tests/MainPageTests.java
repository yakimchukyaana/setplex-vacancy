package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;

@Tag("setplex")
public class MainPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("mainPage")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Main page contains motto")
    void checkMainPageTextTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Check that the text on the main page is correct", () -> {
            setplexPage.checkMainPageText("Simple. Powerful.");
        });
    }

    @Test
    @Tag("mainPage")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Main page has crucial buttons")
    void checkMainPageHasCrucialButtonsTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Check main page has Why Setplex button", () -> {
            setplexPage.checkMainPageHasWhySetplexButton();
        });
        step("Check main page has Start Now button", () -> {
            setplexPage.checkMainPageHasStartNowButton();
        });

    }
}
