package org.example;

import org.example.config.myConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);

        Student student = (Student) context.getBean(Student.class);
        student.show();



    }
}
