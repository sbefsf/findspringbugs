package com.sbefsf.findspringbugs.test.performance;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class JPANPlusOneProblemTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.performance".replace('.', '/'), "JPANPlusOneProblemGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(JPANPlusOneProblemDetector.JPA_N_PLUS_ONE_PROBLEM_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.performance".replace('.', '/'), "JPANPlusOneProblemBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(JPANPlusOneProblemDetector.JPA_N_PLUS_ONE_PROBLEM_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
