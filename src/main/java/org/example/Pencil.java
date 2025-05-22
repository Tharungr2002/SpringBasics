package org.example;

public class Pencil implements Writer{

    @Override
    public void write() {
        System.out.println("Write like a pencil");
    }
    public Pencil() {
        System.out.println("pencil const");
    }

}
