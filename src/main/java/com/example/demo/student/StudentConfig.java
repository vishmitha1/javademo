package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
            return  args -> {
                Student visal=new Student(
                       1L,
                       "Visal",
                       "Visal@gmail.com",
                       LocalDate.of(2000,10,12),
                       24
                );

                Student vsihmitha=new Student(

                        "vishmitha",
                        "visamitha@gmail.com",
                        LocalDate.of(2000,10,12),
                        24
                );
                repository.saveAll(
                        List.of(visal,vsihmitha)
                );
            };
    }

}
