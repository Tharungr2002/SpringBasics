package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rno;

//    @Autowired
//    @Qualifier("pencil")             field injection
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

//    @Autowired
//    @Qualifier("pencil")        setter injection
    public void setWrite(Writer write) {
        System.out.println("getwrite is called");
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

    @Autowired
    public Student(@Qualifier("pencil") Writer writer) {
        this.writer = writer;
    }
}
