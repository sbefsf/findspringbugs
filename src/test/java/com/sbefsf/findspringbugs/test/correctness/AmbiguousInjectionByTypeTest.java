package com.sbefsf.findspringbugs.test.correctness;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class AmbiguousInjectionByTypeTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "AmbiguousInjectionByTypeGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(AmbiguousInjectionByTypeDetector.AMBIGUOUS_INJECTION_BY_TYPE_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "AmbiguousInjectionByTypeBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(AmbiguousInjectionByTypeDetector.AMBIGUOUS_INJECTION_BY_TYPE_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}