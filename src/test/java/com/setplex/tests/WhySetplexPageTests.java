package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import com.setplex.pages.WhySetplexPage;
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
@DisplayName("Why Setplex page contains correct info")
public class WhySetplexPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();
    WhySetplexPage whySetplexPage = new WhySetplexPage();

    @Test
    @Tag("whySetplexPage")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Why steplex page contains information about the advantages of the company")
    void setplexAdvantagesTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click Why Setplex button", () -> {
            setplexPage.clickMainPageButton("Why Setplex");
        });
        step("Check that the text on Why Setplex page is correct", () -> {
            whySetplexPage.checkPageHasCorrectText("We are pioneers in the IPTV/OTT industry");
        });
    }
}
