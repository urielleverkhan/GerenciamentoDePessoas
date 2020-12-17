package com.gerenciamentodepessoas.gerenciamentodepessoas.enums;


public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    PhoneType(String description) {
        this.description = description;
    }
}

