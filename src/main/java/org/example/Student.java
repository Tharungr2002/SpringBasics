package org.example;

public class Student {
    private int rno;
    private Writer writer;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWrite() {
        return writer;
    }

    public void setWrite(Writer write) {
        this.writer = write;
    }

    public void show() {
        System.out.println("Function in Student");
    }

    public Student() {
        System.out.println("Student Object is created");
    }

    public void WriterName() {
        writer.write();
    }
}
