package com.setplex.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

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

    public void openMainPage(){
        open("/en");
    }

    public void checkMainPageText(String text) {
        mainPageContainer.shouldHave(text(text));
    }

    public void clickMainPageButton(String text) {
        mainPageButtonsContainer.$(byText(text)).click();
    }

    public void checkPageHasText(String text) {
        whySetplexPageContainer.shouldHave(Condition.text(text));
    }

    public void changeLanguage() {
        languageNavbar.hover();
        languageDropdown.$(byText("Español")).click();
    }

    public void checkLanguageIsChanged(String text) {
        mainPageTitle.shouldHave(text(text));
    }

    public void checkFormIsVisible() {
        inquiryForm.shouldBe(visible);
    }

    public void clickSubmitButton() {
        button.click();
    }

    public void checkErrorHintIsVisible() {
        errorHint.shouldBe(visible);
    }
}