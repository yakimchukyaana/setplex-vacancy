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
            whySetplexButton = mainPageButtonsContainer.$(byText("Why Setplex")),
            startNowButton = mainPageButtonsContainer.$(byText("Start Now")),
            languageNavbar = $("#navbarDropdownLanguage"),
            languageDropdown = $("[aria-labelledby=navbarDropdownLanguage]"),
            mainPageTitle = $(".title-block"),
            inquiryForm = $(".inquiry-form"),
            button = $(".button"),
            errorHint = $(".form-group-errorText"),
            footerContainer = $(".text-md-center"),
            legalButton = footerContainer.$(byText("LEGAL")),
            privacyPolicyButton = footerContainer.$(byText("Privacy Policy")),
            legalPageHeader = $(".legalDocumentsHeader"),
            privacyPolicyPageHeader = $(".title-container"),
            newsletterButton = $("a[href='newsletter.html']"),
            newsLetterPageHeader = $(".careers_title"),
            submitButton = $(".submit"),
            newsletterFieldError = $("[for='mce-EMAIL'].mce_inline_error"),
            emailField = $("#mce-EMAIL");

    public void openMainPage() {
        open("/en");
    }

    public void checkMainPageText(String text) {
        mainPageContainer.shouldHave(text(text));
    }

    public void checkMainPageHasWhySetplexButton() {
        whySetplexButton.shouldBe(visible);
    }

    public void checkMainPageHasStartNowButton() {
        startNowButton.shouldBe(visible);
    }

    public void clickMainPageButton(String text) {
        mainPageButtonsContainer.$(byText(text)).click();
    }

    public void checkPageHasText(String text) {
        whySetplexPageContainer.shouldHave(Condition.text(text));
    }

    public void changeLanguageHover() {
        languageNavbar.hover();
    }

    public void checkLanguageDropdownIsVisible() {
        languageDropdown.shouldBe(visible);
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

    public void clickButton() {
        button.click();
    }

    public void checkErrorHintIsVisible() {
        errorHint.shouldBe(visible);
    }

    public void clickLegalButton() {
        legalButton.scrollIntoView(false).click();
    }

    public void checkLegalPageContainsCorrectInformation(String text) {
        legalPageHeader.shouldHave(text(text));
    }

    public void clickPrivacyPolicyButton() {
        privacyPolicyButton.scrollIntoView(false).click();
    }

    public void checkPrivacyPolicyPageContainsCorrectInformation(String text) {
        privacyPolicyPageHeader.shouldHave(text(text));
    }

    public void clickNewsletterButton() {
        newsletterButton.scrollIntoView(false).click();
    }

    public void checkNewsLetterPageHasCorrectHeader(String text) {
        newsLetterPageHeader.shouldHave(text(text));
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkErrorIsVisible() {
        newsletterFieldError.shouldBe(visible);
    }

    public void checkErrorHasCorrectText(String text) {
        newsletterFieldError.shouldHave(text(text));
    }

    public void setEmail(String text) {
        emailField.setValue(text);
    }
}