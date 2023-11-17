package com.setplex.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.setplex.pages.DocumentsPage;
import com.setplex.pages.SetplexPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("setplex")
@Owner("Yana Yakimchuk")
@Epic(value = "Check Setplex website")
@Story("Pages functionality")
@Feature(value = "Page info")
@DisplayName("Documents pages contain correct information")
public class DocumentsTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();
    DocumentsPage documentsPage = new DocumentsPage();

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
            documentsPage.checkLegalPageContainsCorrectInformation("Legal Documents");
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
        step("Click Privacy Policy button", () -> {
            setplexPage.clickPrivacyPolicyButton();
        });
        step("Check Privacy Policy page contains Privacy Policy header", () -> {
            documentsPage.checkPrivacyPolicyPageContainsCorrectInformation("Privacy Policy for Setplex");
        });
    }
}
