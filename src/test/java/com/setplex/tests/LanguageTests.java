package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;

@Tag("setplex")
@Owner("Yana Yakimchuk")
@Epic(value = "Check Setplex website")
@Story("Pages functionality")
@Feature(value = "Language change")
@DisplayName("Language can be changed")
public class LanguageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("language")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Language change dropdown appears")
    void languageMenuAppearsTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Move mouse to change language button", () -> {
            setplexPage.changeLanguageHover();
        });
        step("Check that language dropdown is visible", () -> {
            setplexPage.checkLanguageDropdownIsVisible();
        });
    }

    @Test
    @Tag("language")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Language can be changed to spanish")
    void changeLanguageTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Change language to spanish", () -> {
            setplexPage.changeLanguage();
        });
        step("Check that the language is changed", () -> {
            setplexPage.checkLanguageIsChanged("Simple. Poderoso.");
        });
    }
}
