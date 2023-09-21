package com.setplex.tests;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;

public class TestBase {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://setplex.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
