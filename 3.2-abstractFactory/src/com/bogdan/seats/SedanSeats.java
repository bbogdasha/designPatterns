package com.bogdan.seats;

public class SedanSeats implements Seats {

    @Override
    public void paint() {
        System.out.println("You have a four-seater car.");
    }
}
