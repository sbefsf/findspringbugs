package com.sbefsp.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugInstance;
import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;
import org.apache.bcel.Const;

/**
 * This detector identify if there is circular dependency between constructors.
 *
 * More learn...
 * https://www.baeldung.com/circular-dependencies-in-spring
 * https://www.baeldung.com/spring-beancreationexception#1-the-orgspringframeworkbeansfactorybeancurrentlyincreationexception
 *
 * @author Yoo Chul Kim
 */
public class ConstructorCircularDependencyDetector /*extends OpcodeStackDetector*/ {
    private final BugReporter bugReporter;

    public ConstructorCircularDependencyDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

//    @Override
//    public void sawOpcode(int seen) {
//    }
}
