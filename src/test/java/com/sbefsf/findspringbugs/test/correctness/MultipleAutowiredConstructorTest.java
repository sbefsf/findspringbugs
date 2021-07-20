package com.sbefsf.findspringbugs.test.correctness;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class MultipleAutowiredConstructorTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "MultipleAutowiredConstructorGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(MultipleAutowiredConstructorDetector.MULTIPLE_AUTOWIRED_CONSTRUCTOR_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.correctness".replace('.', '/'), "MultipleAutowiredConstructorBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(MultipleAutowiredConstructorDetector.MULTIPLE_AUTOWIRED_CONSTRUCTOR_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
