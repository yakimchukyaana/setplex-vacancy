package com.setplex.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.setplex.config.ConfigReader;
import com.setplex.config.WebConfig;
import com.setplex.config.WebConfigProject;
import com.setplex.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    private static final WebConfig config = ConfigReader.Instance.read();

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
//        Configuration.baseUrl = System.getProperty("baseUrl", "https://setplex.com");
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("browserVersion");
//        Configuration.remote =
//                System.getProperty("remoteDriverUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
//        Configuration.pageLoadStrategy = "eager";
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//
//        Configuration.browserCapabilities = capabilities;
//    }

    @BeforeAll
    static void beforeAll() {
        WebConfigProject webConfigProject = new WebConfigProject(config);
        webConfigProject.webConfig();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}