package com.ih.ioc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IocSpringbootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IocSpringbootApplication.class, args);
        MyComponent myComponent = context.getBean(MyComponent.class);
        myComponent.doSomething();
    }
}
