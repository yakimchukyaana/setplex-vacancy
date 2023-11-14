package com.setplex.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.setplex.pages.SetplexPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("setplex")
public class DocumentsTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("documents")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Legal page contains information about Legal Documents")
    void legalPageContainsCorrectInformation() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click Legal button", () -> {
            setplexPage.clickLegalButton();
        });
        step("Check Legal page contains Legal Documents header", () -> {
            setplexPage.checkLegalPageContainsCorrectInformation("Legal Documents");
        });
    }

    @Test
    @Tag("documents")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Privacy Policy page contains information about Privacy Policy")
    void privacyPolicyPageContainsCorrectInformation1() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click PrivacyPolicy button", () -> {
            setplexPage.clickPrivacyPolicyButton();
        });
        step("Check Privacy Policy page contains Legal Documents header", () -> {
            setplexPage.checkPrivacyPolicyPageContainsCorrectInformation("Privacy Policy for Setplex");
        });
    }
}
