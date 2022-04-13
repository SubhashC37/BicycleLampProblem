package org.interview.test.bicycleLampProblem.impl.lamp;

import org.interview.test.bicycleLampProblem.core.Lamp;
import org.interview.test.bicycleLampProblem.util.Color;

public class RedLamp extends Lamp {

    public RedLamp() {
        super(Color.RED);
    }

    @Override
    public void on() {
        System.out.println("On Red"); // call to redOn() LED driver API
    }

    @Override
    public void flash() {
        System.out.println("Flash Red"); // call to RedFlash() LED driver API
    }
}
