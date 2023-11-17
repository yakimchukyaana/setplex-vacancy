package com.setplex.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NewsletterPage {
    private final SelenideElement
            newsLetterPageHeader = $(".careers_title"),
            submitButton = $(".submit"),
            newsletterFieldError = $("[for='mce-EMAIL'].mce_inline_error"),
            emailField = $("#mce-EMAIL");

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
