package com.bogdan.factories;

import com.bogdan.engine.Engine;
import com.bogdan.engine.SedanEngine;
import com.bogdan.seats.Seats;
import com.bogdan.seats.SedanSeats;
import com.bogdan.tuning.SedanTuning;
import com.bogdan.tuning.Tuning;

public class SedanFactory implements GUIFactory {

    @Override
    public Engine engine() {
        return new SedanEngine();
    }

    @Override
    public Seats seats() {
        return new SedanSeats();
    }

    @Override
    public Tuning tuning() {
        return new SedanTuning();
    }
}
