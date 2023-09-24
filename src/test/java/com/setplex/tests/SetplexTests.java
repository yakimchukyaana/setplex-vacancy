package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
import com.codeborne.selenide.logevents.SelenideLogger;

@Tag("setplex")
public class SetplexTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("mainPage")
    @DisplayName("Main page contains motto")
    void checkMainPageTextTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () ->{
        setplexPage.openMainPage();
        });
        step("Check that the text on the main page is correct", () -> {
        setplexPage.checkMainPageText("Simple. Powerful.");
        });
    }


    @Test
    @Tag("whySetplexPage")
    @DisplayName("Why steplex page contains information about the advantages of the company")
    void whySetplexTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () ->{
            setplexPage.openMainPage();
        });
        step("Click Why Setplex button", () ->{
            setplexPage.clickMainPageButton("Why Setplex");
        });
        step("Check that the text on Why Setplex page is correct", () ->{
            setplexPage.checkPageHasText("Why Setplex");
        });
    }

    @Test
    @Tag("language")
    @DisplayName("Language can be changed to spanish")
    void changeLanguageTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () ->{
            setplexPage.openMainPage();
        });
        step("Change language to spanish", () ->{
            setplexPage.changeLanguage();
        });
        step("Check that the language is changed", () ->{
            setplexPage.checkLanguageIsChanged();
        });
    }

    @Test
    @Tag("startNowPage")
    @DisplayName("There is form on the Start now page")
    void goToFormTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () ->{
            setplexPage.openMainPage();
        });
        step("Click Start Now button", () ->{
            setplexPage.clickMainPageButton("Start Now");
        });
        step("Check that there is form on Start Now page", () ->{
            setplexPage.checkFormIsVisible();
        });
    }

    @Test
    @Tag("startNowPage")
    @DisplayName("Empty form can't be submitted")
    void formWithEmptyFieldsTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () ->{
            setplexPage.openMainPage();
        });
        step("Click Start Now button", () ->{
            setplexPage.clickMainPageButton("Start Now");
        });
        step("Click Submit button", () ->{
            setplexPage.clickSubmitButton();
        });
        step("Check that there are errors near blank fields", () ->{
            setplexPage.checkErrorHintIsVisible();
        });
    }
}
