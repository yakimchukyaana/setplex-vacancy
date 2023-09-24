package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;

public class StartNowPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("startNowPage")
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
            setplexPage.checkFormIsVisible();
        });
    }

    @Test
    @Tag("startNowPage")
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
            setplexPage.clickSubmitButton();
        });
        step("Check that there are errors near blank fields", () -> {
            setplexPage.checkErrorHintIsVisible();
        });
    }
}
