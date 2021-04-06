package com.bogdan;

public class Factory {

    public Cars getCar(TypeCar typeCar) {
        Cars car = null;

        switch (typeCar) {
            case SEDAN:
                car = new Sedan();
                break;
            case PICKUP:
                car = new Pickup();
                break;
            case CABRIOLET:
                car = new Cabriolet();
                break;
            default:
                throw new IllegalArgumentException("Wrong car type: " + typeCar);
        }

        return car;
    }
}
