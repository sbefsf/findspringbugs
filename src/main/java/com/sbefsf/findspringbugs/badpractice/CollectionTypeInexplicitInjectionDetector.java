package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify a collection type injection which is annotated
 * @Autowired + @Qualifier("name") annotation rather than  @Resource(name="name").
 * <p>
 * More learn...
 * Pro Spring 5 (84 page)
 * <p>
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/BadPractice13
 *
 * @author Yoo Chul Kim
 */
public class CollectionTypeInexplicitInjectionDetector implements Detector {
    public static final String COLLECTION_TYPE_INEXPLICIT_INJECTION_TYPE = "COLLECTION_TYPE_INEXPLICIT_INJECTION";
    private final BugReporter bugReporter;

    public CollectionTypeInexplicitInjectionDetector(BugReporter bugReporter) {
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