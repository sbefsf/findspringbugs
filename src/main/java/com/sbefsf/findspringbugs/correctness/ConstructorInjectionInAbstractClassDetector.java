package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify a constructor injection in an abstract class.
 * <p>
 * More learn...
 * https://www.baeldung.com/spring-autowired-abstract-class#constructor-injection
 *
 * @author Yoo Chul Kim
 */
public class ConstructorInjectionInAbstractClassDetector implements Detector {
    public static final String CONSTRUCTOR_INJECTION_IN_ABSTRACT_CLASS_TYPE = "CONSTRUCTOR_INJECTION_IN_ABSTRACT_CLASS";
    private final BugReporter bugReporter;

    public ConstructorInjectionInAbstractClassDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        // 1. Find abstract class in packages.
        // 2. Check if constructor has @Autowired annotation.
    }

    @Override
    public void report() {

    }
}
