package com.ih.ioc.springboot;
import org.springframework.stereotype.Component;

@Component
public class MyDependency {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
