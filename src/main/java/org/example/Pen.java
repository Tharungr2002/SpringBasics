package org.example;

public class Pen implements Writer{
    @Override
    public void write() {
        System.out.println("Write like a pen");
    }

    public Pen() {
        System.out.println("pen const");
    }
}
