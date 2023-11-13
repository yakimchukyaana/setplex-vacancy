package com.setplex.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

        private final Faker faker;

        public TestData() {
            faker = new Faker(new Locale("en"));
        }

        public String generateRandomIncorrectEmail() {
            return faker.name().name();
        }

}
