package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;


/**
 * This detector identify a constructor that use the object defined in the field.
 *
 * More learn...
 * https://www.baeldung.com/running-setup-logic-on-startup-in-spring
 *
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/Correctness24
 *
 * @author Yoo Chul Kim
 */
public class WrongOrderInjectionDetector  implements Detector {
    public static final String WRONG_ORDER_INJECTION_TYPE = "WRONG_ORDER_INJECTION";
    private final BugReporter bugReporter;

    public WrongOrderInjectionDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        // 1
        // 2
    }

    @Override
    public void report() {

    }
}
