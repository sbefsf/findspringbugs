package com.sbefsf.findspringbugs.test.badpractice;

import static edu.umd.cs.findbugs.test.CountMatcher.containsExactly;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.sbefsf.findspringbugs.badpractice.InefficientEnumsPersistenceDetector;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;

import edu.umd.cs.findbugs.BugCollection;
import edu.umd.cs.findbugs.test.SpotBugsRule;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcher;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcherBuilder;

import static edu.umd.cs.findbugs.test.CountMatcher.containsExactly;

public class InefficientEnumsPersistenceTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "InefficientEnumsPersistenceGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(InefficientEnumsPersistenceDetector.INEFFICIENT_ENUMS_PERSISTENCE_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "InefficientEnumsPersistenceBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(InefficientEnumsPersistenceDetector.INEFFICIENT_ENUMS_PERSISTENCE_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }*/
}
