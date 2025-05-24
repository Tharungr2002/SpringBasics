package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{
    @Override
    public void write() {
        System.out.println("Write like a pen");
    }

    public Pen() {
        System.out.println("pen const");
    }
}
