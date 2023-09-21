package com.setplex.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Set;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SetplexPage {
    private final SelenideElement
            mainPageContainer = $(".title-btns-container"),
            mainPageButtonsContainer = $(".btns-container"),
            whySetplexPageContainer = $(".why-one"),
            languageNavbar = $("#navbarDropdownLanguage"),
            languageDropdown = $("[aria-labelledby=navbarDropdownLanguage]"),
            mainPageTitle = $(".title-block"),
            inquiryForm = $(".inquiry-form"),
            button = $(".button"),
            errorHint = $(".form-group-errorText");

    public SetplexPage openMainPage(){
        open("/en");

        return this;
    }

    public void checkMainPageText(String text) {
        mainPageContainer.shouldHave(text(text));
    }

    public SetplexPage clickMainPageButton(String text) {
        mainPageButtonsContainer.$(byText(text)).click();

        return this;
    }

    public void checkPageHasText(String text) {
        whySetplexPageContainer.shouldHave(Condition.text(text));
    }

    public SetplexPage changeLanguage() {
        languageNavbar.hover();
        languageDropdown.$(byText("Español")).click();

        return this;
    }

    public void checkLanguageIsChanged() {
        mainPageTitle.shouldHave(text("Simple. Poderoso."));
    }

    public void checkFormIsVisible() {
        inquiryForm.shouldBe(visible);
    }

    public SetplexPage clickSubmitButton() {
        button.click();

        return this;
    }

    public SetplexPage checkErrorHintIsVisible() {
        errorHint.shouldBe(visible);

        return this;
    }
}