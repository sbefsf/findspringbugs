package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;

/**
 * This detector identify if there is circular dependency between constructors.
 *
 * More learn...
 * https://www.baeldung.com/circular-dependencies-in-spring
 * https://www.baeldung.com/spring-beancreationexception#1-the-orgspringframeworkbeansfactorybeancurrentlyincreationexception
 *
 * @author Yoo Chul Kim
 */
public class ConstructorCircularDependencyDetector implements Detector {
    public static final String CONSTRUCTOR_CIRCULAR_DEPENDENCY_TYPE = "CONSTRUCTOR_CIRCULAR_DEPENDENCY";
    private final BugReporter bugReporter;

    public ConstructorCircularDependencyDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        //
    }

    @Override
    public void report() {

    }
}
