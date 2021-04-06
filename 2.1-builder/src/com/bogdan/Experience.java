package com.bogdan;

public enum Experience {
    INTERN, JUNIOR, MIDDLE, SENIOR, TEAMLEAD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
