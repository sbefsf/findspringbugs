package com.sbefsf.findspringbugs.test.badpractice;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class NonSpecificWrappedExceptionThrowTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

/*    @Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "NonSpecificWrappedExceptionThrowGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(NonSpecificWrappedExceptionThrowDetector.NON_SPECIFIC_WRAPPED_EXCEPTION_THROW_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "NonSpecificWrappedExceptionThrowBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(NonSpecificWrappedExceptionThrowDetector.NON_SPECIFIC_WRAPPED_EXCEPTION_THROW_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
