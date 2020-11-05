package com.example.psychologicalassessmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author EMD-WANGENGUI
 * @date 2020/11/05 14:05
 */
@SpringBootApplication
public class PsychologicalAssessmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsychologicalAssessmentSystemApplication.class, args);
    }

}
