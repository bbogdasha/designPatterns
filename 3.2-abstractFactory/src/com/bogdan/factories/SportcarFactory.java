package com.bogdan.factories;

import com.bogdan.engine.Engine;
import com.bogdan.engine.SportcarEngine;
import com.bogdan.seats.Seats;
import com.bogdan.seats.SportcarSeats;
import com.bogdan.tuning.SportcarTuning;
import com.bogdan.tuning.Tuning;

public class SportcarFactory implements GUIFactory {

    @Override
    public Engine engine() {
        return new SportcarEngine();
    }

    @Override
    public Seats seats() {
        return new SportcarSeats();
    }

    @Override
    public Tuning tuning() {
        return new SportcarTuning();
    }
}
