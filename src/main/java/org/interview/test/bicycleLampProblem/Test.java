package org.interview.test.bicycleLampProblem;

import org.interview.test.bicycleLampProblem.impl.button.Button1;
import org.interview.test.bicycleLampProblem.impl.button.Button2;

public class Test {
    public static void main(String[] args) {
        Button1 button1 = new Button1();
        Button2 button2 = new Button2();

        button1.press();
        button1.press();
        button2.press();
        button1.press();
        button1.press();
        button1.press();


    }
}
