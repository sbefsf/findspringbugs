package com.sbefsf.findspringbugs.test.correctness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

// Source from https://www.baeldung.com/running-setup-logic-on-startup-in-spring
public class WrongOrderInjectionBadCase {
    @Component
    public class InvalidInitExampleBean {

        @Autowired
        private Environment env;

        public InvalidInitExampleBean() {
            env.getActiveProfiles(); // not yet initialized fields -> NullPointerExceptions occur
        }
    }
}
