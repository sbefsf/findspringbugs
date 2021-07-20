package com.sbefsf.findspringbugs.test.correctness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Referred to
// https://www.baeldung.com/spring-beancreationexception#1-the-orgspringframeworkbeansfactorybeancurrentlyincreationexception
// https://www.baeldung.com/circular-dependencies-in-spring
public class ConstructorCircularDependencyBadCase {

    // --------- example 1 ---------
    private interface IBeanA {
    }

    private interface IBeanB {
    }

    @Component
    private class BeanA implements IBeanA {
        private IBeanB beanB; // circular dependencies

        @Autowired
        public BeanA(final IBeanB beanB) {
            super();
            this.beanB = beanB;
        }
    }

    @Component
    private class BeanB implements IBeanB {
        final IBeanA beanA; // circular dependencies

        @Autowired
        public BeanB(final IBeanA beanA) {
            super();
            this.beanA = beanA;
        }
    }

    // --------- example 2 ---------
    @Component
    private class CircularDependencyA {

        private CircularDependencyB circB;

        @Autowired
        public CircularDependencyA(CircularDependencyB circB) {
            this.circB = circB;
        }
    }

    @Component
    private class CircularDependencyB {

        private CircularDependencyA circA;

        @Autowired
        public CircularDependencyB(CircularDependencyA circA) {
            this.circA = circA;
        }
    }
}
