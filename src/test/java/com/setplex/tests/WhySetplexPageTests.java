package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;

public class WhySetplexPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("whySetplexPage")
    @DisplayName("Why steplex page contains information about the advantages of the company")
    void whySetplexTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click Why Setplex button", () -> {
            setplexPage.clickMainPageButton("Why Setplex");
        });
        step("Check that the text on Why Setplex page is correct", () -> {
            setplexPage.checkPageHasText("Why Setplex");
        });
    }
}
