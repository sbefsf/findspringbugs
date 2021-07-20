package com.sbefsf.findspringbugs.test.correctness;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class AbstractClassBeanTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "AbstractClassBeanGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(AbstractClassBeanDetector.ABSTRACT_CLASS_BEAN_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "AbstractClassBeanBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(AbstractClassBeanDetector.ABSTRACT_CLASS_BEAN_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
