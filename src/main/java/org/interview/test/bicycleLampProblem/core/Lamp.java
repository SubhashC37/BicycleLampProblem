package org.interview.test.bicycleLampProblem.core;

import org.interview.test.bicycleLampProblem.util.Color;

public abstract class Lamp {
    private Color color;

    protected Lamp(Color color) {
        this.color = color;
    }

    public abstract void on();

    public abstract void flash();

    public void off() {
        System.out.println("Lamp off"); // call to ledOff() LED driver API
    }

    public Color getColor() {
        return color;
    }
}
