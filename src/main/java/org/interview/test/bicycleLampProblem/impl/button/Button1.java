package org.interview.test.bicycleLampProblem.impl.button;

import org.interview.test.bicycleLampProblem.core.Button;
import org.interview.test.bicycleLampProblem.impl.lamp.RedLamp;

public class Button1 extends Button {

    @Override
    public void press() {
        switch (getPressCount()) {
            case 0:
                setLamp(new RedLamp());
                getLamp().on();
                increaseCount();
                break;
            case 1:
                getLamp().flash();
                increaseCount();
                break;
            case 2:
                getLamp().off();
                resetButton();
                break;
        }
    }
}
