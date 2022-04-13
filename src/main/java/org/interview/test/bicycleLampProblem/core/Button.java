package org.interview.test.bicycleLampProblem.core;

public abstract class Button {
    private static Lamp lamp = null;
    private int pressCount = 0;

    protected void setLamp(Lamp LAMP) {
        Button.lamp = LAMP;
    }

    protected Lamp getLamp() {
        return lamp;
    }

    protected void increaseCount() {
        pressCount++;
    }

    protected int getPressCount() {
        return pressCount;
    }

    protected void resetButton() {
        pressCount = 0;
        lamp = null;
    }

    protected abstract void press();
}
