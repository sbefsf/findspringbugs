package com.sbefsf.findspringbugs.test.correctness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Source from https://www.baeldung.com/spring-beancreationexception#cause-2
public class AmbiguousInjectionByTypeBadCase {
    @Component
    private class BeanB1 implements IBeanB {  }
    @Component
    private class BeanB2 implements IBeanB {  }

    @Component
    private class BeanA {
        @Autowired
        private IBeanB dependency; // error: Spring doesn't know which component to autowire
    }

    private interface IBeanB {
    }
}
