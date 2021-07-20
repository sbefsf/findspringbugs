package com.sbefsf.findspringbugs.test.correctness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// Source from Pro Spring 5 book - Chapter 3 (63 page)
public class MultipleAutowiredConstructorBadCase {
    private String someValue;

    @Autowired
    public MultipleAutowiredConstructorBadCase(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    @Autowired // Just one!!
    public MultipleAutowiredConstructorBadCase(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public String toString() {
        return someValue;
    }
}
