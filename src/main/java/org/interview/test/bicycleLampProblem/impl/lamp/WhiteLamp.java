package org.interview.test.bicycleLampProblem.impl.lamp;

import org.interview.test.bicycleLampProblem.core.Lamp;
import org.interview.test.bicycleLampProblem.util.Color;

public class WhiteLamp extends Lamp {

    public WhiteLamp() {
        super(Color.WHITE);
    }

    @Override
    public void on() {
        System.out.println("On White"); // call to whiteOn() LED driver API
    }

    @Override
    public void flash() {
        System.out.println("Flash White"); // call to WhiteFlash() LED driver API
    }
}
