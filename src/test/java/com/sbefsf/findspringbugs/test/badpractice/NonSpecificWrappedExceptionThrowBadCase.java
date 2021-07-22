package com.sbefsf.findspringbugs.test.badpractice;

public class NonSpecificWrappedExceptionThrowBadCase {
    // Bad Case which always makes same error message (causing hard to debug)
    /*@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Actor Not Found")
    public class ActorNotFoundException extends Exception {
        // ...
    }*/
}
