package com.bogdan;

public enum Team {
    BACKEND, FRONTEND, TESTER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
