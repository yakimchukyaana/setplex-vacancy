package com.setplex.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DocumentsPage {
    private final SelenideElement
            legalPageHeader = $(".legalDocumentsHeader"),
            privacyPolicyPageHeader = $(".title-container");

    public void checkLegalPageContainsCorrectInformation(String text) {
        legalPageHeader.shouldHave(text(text));
    }

    public void checkPrivacyPolicyPageContainsCorrectInformation(String text) {
        privacyPolicyPageHeader.shouldHave(text(text));
    }
}


