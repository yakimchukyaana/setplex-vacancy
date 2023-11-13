//package com.setplex.tests;
//
//import com.codeborne.selenide.Condition;
//import com.setplex.pages.SetplexPage;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//@Tag("chat")
//public class ChatTests extends TestBase {
//
//    SetplexPage setplexPage = new SetplexPage();
//
//    @Test
//    void chatAppearsTest() {
//        open("https://setplex.com/en/");
//        $(".chat-button").scrollIntoView(true).click();
//        $(".chat-header ").shouldBe(Condition.visible);
//    }
//
//}
