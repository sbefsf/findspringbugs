package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify multiple @Autowired annotations on constructors.
 *
 * More learn...
 * See Pro Spring 5 book - Chapter 3 (63 page)
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/Correctness27
 *
 * @author Yoo Chul Kim
 */
public class MultipleAutowiredConstructorDetector implements Detector {
    public static final String MULTIPLE_AUTOWIRED_CONSTRUCTOR_TYPE = "MULTIPLE_AUTOWIRED_CONSTRUCTOR";
    private final BugReporter bugReporter;

    public MultipleAutowiredConstructorDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        // 1 Find beans which has multiple Autowired in the constructors.
        //   - can look for bytecode which has multiple <init> with Autowired
        //   - e.g., public <init>(I)V @Lorg/springframework/beans/factory/annotation/Autowired;()
    }

    @Override
    public void report() {

    }
}
