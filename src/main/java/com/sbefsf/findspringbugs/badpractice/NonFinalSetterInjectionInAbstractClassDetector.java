package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

public class NonFinalSetterInjectionInAbstractClassDetector implements Detector {
    public static final String NON_FINAL_SETTER_INJECTION_IN_ABSTRACT_CLASS_TYPE = "NON_FINAL_SETTER_INJECTION_IN_ABSTRACT_CLASS";
    private final BugReporter bugReporter;

    public NonFinalSetterInjectionInAbstractClassDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        // 1
    }

    @Override
    public void report() {

    }
}
