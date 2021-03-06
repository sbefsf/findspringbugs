package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify if there is circular dependency between constructors.
 * <p>
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
        // 1 Insert injected beans in the Bean A's constructor into List
        // 2 Check if the beans in the list also inject Bean A in their constructor
        //    - Consider also inheritance and implementation (e.g. the second example in the bad case)
    }

    @Override
    public void report() {

    }
}
