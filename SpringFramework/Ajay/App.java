package com.Ajay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Vehical obj=(Vehical) context.getBean("vehicle");
//        Vehical obj=(Vehical) context.getBean("car");
//        obj.drive();

//        Vehical obj2=(Vehical) context.getBean("bike");
//        obj2.drive();
//        Tyre t=(Tyre) context.getBean("tyre");
//        System.out.println(t);

        Car obj=(Car) context.getBean("car");
        obj.drive();
     }
}
