package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class myConfig {

//    @Bean
//    public Student student(@Qualifier("pen") Writer writer) {
//        Student st = new Student();
//        st.setRno(228);
//        st.setWrite(writer);
//        return st;
//    }
//    @Bean
//    @Primary
//    @Qualifier("pencil")
//    public Pencil pencil() {
//        return new Pencil();
//    }
//    @Bean
//     //higher priority than primary
//    public Pen pen() {
//        return new Pen();
//    }

}
