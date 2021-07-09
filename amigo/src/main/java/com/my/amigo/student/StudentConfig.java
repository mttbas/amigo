package com.my.amigo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student Maryam = new Student(
                    "Maryam Wehe",
                    "m.moh@gmx.ch",
                    LocalDate.of(1970, Month.MAY, 8));
            Student Alex = new Student(
                    "Alex Wehe",
                    "alex@gmx.ch",
                    LocalDate.of(2003, Month.MAY, 8));

            studentRepository.saveAll(
                    List.of(Maryam, Alex)
            );
        };
    }
}
