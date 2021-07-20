package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify multiple beans which inherit the same interface and
 * the bean is not clearly specified.
 *
 * More learn...
 * See Pro Spring book 5th ed. (112 page)
 * https://www.baeldung.com/spring-beancreationexception#cause-2
 * https://stackoverflow.com/questions/9106416/difference-between-qualifier-and-resource
 *
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/Correctness7
 *
 * @author Yoo Chul Kim
 */
public class AmbiguousInjectionByTypeDetector implements Detector {
    public static final String AMBIGUOUS_INJECTION_BY_TYPE_TYPE = "AMBIGUOUS_INJECTION_BY_TYPE";
    private final BugReporter bugReporter;

    public AmbiguousInjectionByTypeDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        // TODO: Implement the detector with strategy below
        // 1 Bytecode of the bad case (TBH, cannot understand how the beans are injected)
        /*   L0
            LINENUMBER 13 L0
            ALOAD 0
            ALOAD 1
            PUTFIELD com/sbefsf/findspringbugs/test/correctness/AmbiguousInjectionByTypeBadCase$BeanA.this$0 : Lcom/sbefsf/findspringbugs/test/correctness/AmbiguousInjectionByTypeBadCase;
            ALOAD 0
            INVOKESPECIAL java/lang/Object.<init> ()V
            RETURN
           L1
            LOCALVARIABLE this Lcom/sbefsf/findspringbugs/test/correctness/AmbiguousInjectionByTypeBadCase$BeanA; L0 L1 0
            LOCALVARIABLE this$0 Lcom/sbefsf/findspringbugs/test/correctness/AmbiguousInjectionByTypeBadCase; L0 L1 1
            MAXSTACK = 2
            MAXLOCALS = 2 */
    }

    @Override
    public void report() {

    }
}
