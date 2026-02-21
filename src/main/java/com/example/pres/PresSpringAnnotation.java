package com.example.pres;

import com.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.example");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}