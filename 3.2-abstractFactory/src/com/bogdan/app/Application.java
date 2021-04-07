package com.bogdan.app;

import com.bogdan.engine.Engine;
import com.bogdan.factories.GUIFactory;
import com.bogdan.seats.Seats;
import com.bogdan.tuning.Tuning;

public class Application {

    private final Engine engine;
    private final Seats seats;
    private final Tuning tuning;

    public Application(GUIFactory guiFactory) {
        engine = guiFactory.engine();
        seats = guiFactory.seats();
        tuning = guiFactory.tuning();
    }

    public void paint() {
        System.out.print("Engine: ");
        engine.paint();

        System.out.print("Seats: ");
        seats.paint();

        System.out.print("Tuning: ");
        tuning.paint();
    }
}
