package com.bogdan;

import com.bogdan.app.Application;
import com.bogdan.factories.GUIFactory;
import com.bogdan.factories.SedanFactory;
import com.bogdan.factories.SportcarFactory;

public class Main {

    private static Application configuration(String typeCar) {
        Application application;
        GUIFactory guiFactory;

        if (typeCar.contains("sportcar")) {
            guiFactory = new SportcarFactory();
        } else {
            guiFactory = new SedanFactory();
        }

        application = new Application(guiFactory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configuration("sportcar");

        System.out.println("Characteristics your car: ");
        application.paint();
    }
}
