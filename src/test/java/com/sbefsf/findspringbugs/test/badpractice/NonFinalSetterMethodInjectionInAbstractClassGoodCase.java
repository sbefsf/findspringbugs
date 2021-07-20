package com.sbefsf.findspringbugs.test.badpractice;

import org.springframework.beans.factory.annotation.Autowired;

// Source from https://www.baeldung.com/spring-autowired-abstract-class
public class NonFinalSetterMethodInjectionInAbstractClassGoodCase {
    private abstract class BallService {
        private LogRepository logRepository;

        @Autowired
        public final void setLogRepository(LogRepository logRepository) {
            this.logRepository = logRepository;
        }
    }

    private class LogRepository {
    }
}
