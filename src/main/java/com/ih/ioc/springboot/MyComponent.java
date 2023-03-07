package com.ih.ioc.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final MyDependency myDependency;
    
    @Autowired
    public MyComponent(MyDependency myDependency) {
        this.myDependency = myDependency;
    }
    
    public void doSomething() {
        myDependency.doSomething();
    }
}
