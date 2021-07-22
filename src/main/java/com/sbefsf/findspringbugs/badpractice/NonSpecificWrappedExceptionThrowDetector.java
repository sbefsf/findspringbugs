package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify non specific wrapped exception throw.
 *
 * @author Yoo Chul Kim
 */
public class NonSpecificWrappedExceptionThrowDetector implements Detector {
    public static final String NON_SPECIFIC_WRAPPED_EXCEPTION_THROW_TYPE = "NON_SPECIFIC_WRAPPED_EXCEPTION_THROW";
    private final BugReporter bugReporter;

    public NonSpecificWrappedExceptionThrowDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
    }

    @Override
    public void report() {

    }
}