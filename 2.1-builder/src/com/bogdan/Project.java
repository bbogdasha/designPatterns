package com.bogdan;

public enum Project {
    APP_ONE, APP_TWO, APP_THREE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
