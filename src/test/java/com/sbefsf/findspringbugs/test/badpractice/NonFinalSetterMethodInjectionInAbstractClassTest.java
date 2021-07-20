package com.sbefsf.findspringbugs.test.badpractice;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class NonFinalSetterMethodInjectionInAbstractClassTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "NonFinalSetterMethodInjectionInAbstractClassGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(NonFinalSetterInjectionInAbstractClassDetector.NON_FINAL_SETTER_INJECTION_IN_ABSTRACT_CLASS_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "NonFinalSetterMethodInjectionInAbstractClassBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(NonFinalSetterInjectionInAbstractClassDetector.NON_FINAL_SETTER_INJECTION_IN_ABSTRACT_CLASS_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
