package com.setplex.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class StartNowPage {
    private final SelenideElement
            inquiryForm = $(".inquiry-form"),
            button = $(".button"),
            errorHint = $(".form-group-errorText");

    public void checkFormIsVisible() {
        inquiryForm.shouldBe(visible);
    }

    public void clickButton() {
        button.click();
    }

    public void checkErrorHintIsVisible() {
        errorHint.shouldBe(visible);
    }
}
