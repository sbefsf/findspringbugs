package com.sbefsf.findspringbugs.test.correctness;

import org.springframework.stereotype.Component;

public class AbstractClassBeanBadCase {
    @Component
    private abstract class Test {

    }
}
