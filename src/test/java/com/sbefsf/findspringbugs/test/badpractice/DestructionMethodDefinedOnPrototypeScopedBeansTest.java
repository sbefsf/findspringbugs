package com.sbefsf.findspringbugs.test.badpractice;

import static edu.umd.cs.findbugs.test.CountMatcher.containsExactly;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.sbefsf.findspringbugs.badpractice.DestructionMethodDefinedOnPrototypeScopedBeansDetector;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;

import edu.umd.cs.findbugs.BugCollection;
import edu.umd.cs.findbugs.test.SpotBugsRule;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcher;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcherBuilder;

public class DestructionMethodDefinedOnPrototypeScopedBeansTest {
    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    /*@Test
    public void testGoodCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "DestructionMethodDefinedOnPrototypeScopedBeansGoodCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(DestructionMethodDefinedOnPrototypeScopedBeansDetector.DESTRUCTION_METHOD_DEFINED_ON_PROTOTYPE_SCOPED_BEAN_TYPE).build();
        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("target/test-classes", "com.sbefsf.findspringbugs.test.badpractice".replace('.', '/'), "DestructionMethodDefinedOnPrototypeScopedBeansBadCase.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType(DestructionMethodDefinedOnPrototypeScopedBeansDetector.DESTRUCTION_METHOD_DEFINED_ON_PROTOTYPE_SCOPED_BEAN_TYPE).build();

        MatcherAssert.assertThat(bugCollection, containsExactly(0, bugTypeMatcher)); // change 0 to 1
    }*/
}
