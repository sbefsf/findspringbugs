package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify if a collection type injection comes with @Resource(name="name")
 * rather than @Autowired + @Qualifier("name")
 * <p>
 * More learn...
 * Pro Spring 5 (84 page)
 * <p>
 * WIKI: https://github.com/SpotBugsExtensionForSpringFrameWork/CS5098/wiki/BadPractice13
 *
 * @author Yoo Chul Kim
 */
public class ShortlyAnnotatedCollectionTypeInjectionDetector implements Detector {
    public static final String SHORTLY_ANNOTATED_COLLECTION_TYPE_INJECTION_TYPE = "SHORTLY_ANNOTATED_COLLECTION_TYPE_INJECTION";
    private final BugReporter bugReporter;

    public ShortlyAnnotatedCollectionTypeInjectionDetector(BugReporter bugReporter) {
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