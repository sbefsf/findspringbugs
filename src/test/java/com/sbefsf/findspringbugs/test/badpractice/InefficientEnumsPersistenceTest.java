package com.sbefsf.findspringbugs.test.badpractice;

import edu.umd.cs.findbugs.BugCollection;
import edu.umd.cs.findbugs.test.SpotBugsRule;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcher;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcherBuilder;
import org.junit.Rule;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static edu.umd.cs.findbugs.test.CountMatcher.containsExactly;
import static org.junit.Assert.assertThat;

public class InefficientEnumsPersistenceTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    @Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsp.findspringbugs.test.badpractice".replace('.', '/'), "InefficientEnumsPersistenceGoodCase.class");
        spotbugs.performAnalysis(path);
//        BugCollection bugCollection = spotbugs.performAnalysis(path);
//
//        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
//                .bugType("INEFFICIENT_ENUMS_PERSISTENCE").build();
//        assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsp.findspringbugs.test.badpractice".replace('.', '/'), "InefficientEnumsPersistenceBadCase.class");
        spotbugs.performAnalysis(path);

//        BugCollection bugCollection = spotbugs.performAnalysis(path);
//
//        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
//                .bugType("INEFFICIENT_ENUMS_PERSISTENCE").build();
//        assertThat(bugCollection, containsExactly(1, bugTypeMatcher));
    }
}
