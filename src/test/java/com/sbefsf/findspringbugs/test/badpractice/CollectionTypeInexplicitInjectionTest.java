package com.sbefsf.findspringbugs.test.badpractice;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class CollectionTypeInexplicitInjectionTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

   /* @Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "CollectionTypeInexplicitInjectionGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(CollectionTypeInexplicitInjectionDetector.COLLECTION_TYPE_INEXPLICIT_INJECTION_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "CollectionTypeInexplicitInjectionBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(CollectionTypeInexplicitInjectionDetector.COLLECTION_TYPE_INEXPLICIT_INJECTION_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
