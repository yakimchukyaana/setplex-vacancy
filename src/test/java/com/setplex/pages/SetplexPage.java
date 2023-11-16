package com.setplex.pages;

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
            whySetplexButton = mainPageButtonsContainer.$(byText("Why Setplex")),
            startNowButton = mainPageButtonsContainer.$(byText("Start Now")),
            languageNavbar = $("#navbarDropdownLanguage"),
            languageDropdown = $("[aria-labelledby=navbarDropdownLanguage]"),
            mainPageTitle = $(".title-block"),
            footerContainer = $(".text-md-center"),
            legalButton = footerContainer.$(byText("LEGAL")),
            privacyPolicyButton = footerContainer.$(byText("Privacy Policy")),
            newsletterButton = $("a[href='newsletter.html']");

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

    public void clickLegalButton() {
        legalButton.scrollIntoView(false).click();
    }

    public void clickPrivacyPolicyButton() {
        privacyPolicyButton.scrollIntoView(false).click();
    }

    public void clickNewsletterButton() {
        newsletterButton.scrollIntoView(false).click();
    }
}