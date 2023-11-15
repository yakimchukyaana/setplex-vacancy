package com.setplex.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.setplex.pages.SetplexPage;
import com.setplex.utils.TestData;
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
@Feature(value = "Newsletter forms")
public class NewsletterPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();
    TestData testData = new TestData();

    @Test
    @Tag("newsletter")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Newsletter page has correct header")
    void newsletterPageHeaderTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click newsletter button", () -> {
            setplexPage.clickNewsletterButton();
        });
        step("Check header", () -> {
            setplexPage.checkNewsLetterPageHasCorrectHeader("Welcome to our newsletter signup");
        });
    }

    @Test
    @Tag("newsletter")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Newsletter form with empty email field can't be sent")
    void emptyFieldTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click newsletter button", () -> {
            setplexPage.clickNewsletterButton();
        });
        step("Click submit button", () -> {
            setplexPage.clickSubmitButton();
        });
        step("Check that error is visible", () -> {
            setplexPage.checkErrorIsVisible();
        });
        step("Check that error has correct text", () -> {
            setplexPage.checkErrorHasCorrectText("This field is required");
        });
    }

    @Test
    @Tag("newsletter")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Newsletter form with incorrect email can't be sent")
    void incorrectEmailTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Click newsletter button", () -> {
            setplexPage.clickNewsletterButton();
        });
        step("Set incorrect email", () -> {
            setplexPage.setEmail(testData.generateRandomIncorrectEmail());
        });
        step("Click submit button", () -> {
            setplexPage.clickSubmitButton();
        });
        step("Check that error is visible", () -> {
            setplexPage.checkErrorIsVisible();
        });
        step("Check that error has correct text", () -> {
            setplexPage.checkErrorHasCorrectText("Please enter a valid email address");
        });
    }
}
