package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify non unique bean definition.
 *
 * @author Yoo Chul Kim
 */
public class NonUniqueBeanDefinitionDetector implements Detector {
    public static final String NON_UNIQUE_BEAN_DEFINITION_TYPE = "NON_UNIQUE_BEAN_DEFINITION";
    private final BugReporter bugReporter;

    public NonUniqueBeanDefinitionDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
    }

    @Override
    public void report() {

    }
}
