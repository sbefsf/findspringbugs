package com.sbefsf.findspringbugs.test.badpractice;

import edu.umd.cs.findbugs.test.SpotBugsRule;
import org.junit.Rule;

public class ShortlyAnnotatedCollectionTypeInjectionTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "ShortlyAnnotatedCollectionTypeInjectionGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(CollectionTypeExplicitInjectionDetector.SHORTLY_ANNOTATED_COLLECTION_TYPE_INJECTION).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "ShortlyAnnotatedCollectionTypeInjectionBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(CollectionTypeExplicitInjectionDetector.SHORTLY_ANNOTATED_COLLECTION_TYPE_INJECTION).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
