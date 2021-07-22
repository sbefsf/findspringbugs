package com.sbefsf.findspringbugs.performance;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

public class JPANPlusOneProblemDetector  implements Detector {
    public static final String JPA_N_PLUS_ONE_PROBLEM_TYPE = "JPA_N_PLUS_ONE_PROBLEM";
    private final BugReporter bugReporter;

    public JPANPlusOneProblemDetector(BugReporter bugReporter) {
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
