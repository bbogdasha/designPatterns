package com.bogdan.factories;

import com.bogdan.engine.Engine;
import com.bogdan.seats.Seats;
import com.bogdan.tuning.Tuning;

public interface GUIFactory {
    Engine engine();
    Seats seats();
    Tuning tuning();
}
