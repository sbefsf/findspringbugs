package com.sbefsf.findspringbugs.badpractice;


import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector locates destruction method on the beans with prototype scope
 * <p>
 * More learn...
 * Pro Spring 5, Ch 4 - section of "Hooking into Bean Destruction" (139 page)
 *
 * @author Yoo Chul Kim
 */
public class DestructionMethodDefinedOnPrototypeScopedBeansDetector implements Detector {
    public static final String DESTRUCTION_METHOD_DEFINED_ON_PROTOTYPE_SCOPED_BEAN_TYPE = "DESTRUCTION_METHOD_DEFINED_ON_PROTOYPE_SCOPED_BEAN";

    final BugReporter bugReporter;

    public DestructionMethodDefinedOnPrototypeScopedBeansDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement detector with strategy below
        // 1. Find beans with Prototype scope
        // 2. Check if they have destruction method
        //    There are 4 way to hook into bean destruction.
        //    - Custom destroy() methods in bean configuration file
        //    - DisposableBean callback interfaces
        //    - @PreDestroy annotations
        //    - @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy") for Java Configuration
    }

    @Override
    public void report() {

    }
}
