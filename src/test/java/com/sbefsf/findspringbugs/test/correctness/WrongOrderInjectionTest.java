package com.sbefsf.findspringbugs.test.correctness;

import com.sbefsf.findspringbugs.correctness.WrongOrderInjectionDetector;
import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class WrongOrderInjectionTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "WrongOrderInjectionDetector.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(WrongOrderInjectionDetector.WRONG_ORDER_INJECTION_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "WrongOrderInjectionDetector.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(WrongOrderInjectionDetector.WRONG_ORDER_INJECTION_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}