package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify a bean defined as abstract class.
 * <p>
 * More learn...
 * https://www.baeldung.com/spring-beancreationexception#2-javalanginstantiationexception
 * <p>
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/Correctness8
 *
 * @author Yoo Chul Kim
 */
public class AbstractClassBeanDetector implements Detector {
    public static final String ABSTRACT_CLASS_BEAN_TYPE = "ABSTRACT_CLASS_BEAN";
    private final BugReporter bugReporter;

    public AbstractClassBeanDetector(BugReporter bugReporter) {
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