package com.bogdan;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Cars sedan = factory.getCar(TypeCar.SEDAN);
        Cars pickup = factory.getCar(TypeCar.PICKUP);
        Cars cabriolet = factory.getCar(TypeCar.CABRIOLET);

        sedan.driving();
        pickup.driving();
        cabriolet.driving();
    }
}
