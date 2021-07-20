package com.sbefsf.findspringbugs.test.badpractice;

import org.springframework.beans.factory.annotation.Autowired;

// Source from https://www.baeldung.com/spring-autowired-abstract-class
public class NonFinalSetterMethodInjectionInAbstractClassBadCase {
    private abstract class BallService {
        private LogRepository logRepository;

        @Autowired
        public void setLogRepository(LogRepository logRepository) { // Should be final
            this.logRepository = logRepository;
        }
    }

    private class LogRepository {
    }
}
