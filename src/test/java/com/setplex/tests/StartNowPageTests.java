package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import com.setplex.pages.StartNowPage;
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
@Feature(value = "Page info")
@DisplayName("Start Now page contains correct info and form")
public class StartNowPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();
    StartNowPage startNowPage = new StartNowPage();

    @Test
    @Tag("startNowPage")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("There is form on the Start now page")
    void goToFormTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click Start Now button", () -> {
            setplexPage.clickMainPageButton("Start Now");
        });
        step("Check that there is form on Start Now page", () -> {
            //setplexPage.checkFormIsVisible();
            startNowPage.checkFormIsVisible();
        });
    }

    @Test
    @Tag("startNowPage")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Empty form can't be submitted")
    void formWithEmptyFieldsTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click Start Now button", () -> {
            setplexPage.clickMainPageButton("Start Now");
        });
        step("Click Submit button", () -> {
//            setplexPage.clickButton();
            startNowPage.clickButton();
        });
        step("Check that there are errors near blank fields", () -> {
//            setplexPage.checkErrorHintIsVisible();
            startNowPage.checkErrorHintIsVisible();
        });
    }
}
