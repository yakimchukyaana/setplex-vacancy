package com.setplex.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WhySetplexPage {
    private final SelenideElement
            whySetplexPageContainer = $(".why-one");

    public void checkPageHasCorrectText(String text) {
        whySetplexPageContainer.shouldHave(Condition.text(text));
    }
}
