package com.bogdan.seats;

public class SportcarSeats implements Seats {

    @Override
    public void paint() {
        System.out.println("You have a two-seater car.");
    }
}
