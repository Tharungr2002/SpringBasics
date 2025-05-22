package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class myConfig {

    @Bean
    @Qualifier("Pencil")
    public Student student(Writer writer) {
        Student st = new Student();
        st.setRno(228);
        st.setWrite(writer);
        return st;
    }



    @Bean
    @Primary

    public Pencil pencil() {
        return new Pencil();
    }


    @Bean
    @Qualifier() //higher priority than primary
    public Pen pen() {
        return new Pen();
    }

}
