package com.example.chinalawtranslate.po;

public enum Status {

    UNPUBLISHED("0"),
    PUBLISHED("1");

    String value;

    Status(String value) {
        this.value=value;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String value) {
        for (Status s: Status.values()) {
            if(s.value.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
