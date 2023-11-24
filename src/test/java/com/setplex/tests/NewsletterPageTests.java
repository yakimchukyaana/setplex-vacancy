package com.setplex.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.setplex.pages.NewsletterPage;
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
@DisplayName("Newsletter page and form are correct")
public class NewsletterPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();
    NewsletterPage newsletterPage = new NewsletterPage();
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
            newsletterPage.checkNewsLetterPageHasCorrectHeader("Welcome to our newsletter signup");
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
            newsletterPage.clickSubmitButton();
        });
        step("Check that error is visible", () -> {
            newsletterPage.checkErrorIsVisible();
        });
        step("Check that error has correct text", () -> {
            newsletterPage.checkErrorHasCorrectText("This field is required");
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
            newsletterPage.setEmail(testData.generateRandomIncorrectEmail());
        });
        step("Click submit button", () -> {
            newsletterPage.clickSubmitButton();
        });
        step("Check that error is visible", () -> {
            newsletterPage.checkErrorIsVisible();
        });
        step("Check that error has correct text", () -> {
            newsletterPage.checkErrorHasCorrectText("Please enter a valid email address");
        });
    }
}
