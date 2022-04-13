package org.interview.test.bicycleLampProblem.impl.button;

import org.interview.test.bicycleLampProblem.core.Button;
import org.interview.test.bicycleLampProblem.util.Color;
import org.interview.test.bicycleLampProblem.core.Lamp;
import org.interview.test.bicycleLampProblem.impl.lamp.RedLamp;
import org.interview.test.bicycleLampProblem.impl.lamp.WhiteLamp;

public class Button2 extends Button {

    @Override
    public void press() {
        Lamp lamp = getLamp();
        if (lamp != null) {
            changeLamp(lamp);
        }
    }

    private void changeLamp(Lamp lamp) {
        if (lamp.getColor() == Color.RED) {
            setLamp(new WhiteLamp());
        } else {
            setLamp(new RedLamp());
        }
    }
}
