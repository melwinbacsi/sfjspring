package com.elsoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication

public class ElsoProjectApplication {

    public static void main(String[] args) {
        ApplicationContext ct = SpringApplication.run(ElsoProjectApplication.class, args);
        String[] beanArray = ct.getBeanDefinitionNames();
        Arrays.sort(beanArray);
        for(String name : beanArray){
            System.out.println(name);
        }
    }

}

