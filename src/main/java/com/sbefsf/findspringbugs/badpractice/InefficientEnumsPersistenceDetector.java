package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.LaunchAppropriateUI;
import edu.umd.cs.findbugs.PrintingBugReporter;
import edu.umd.cs.findbugs.ba.ClassContext;
import edu.umd.cs.findbugs.test.AnalysisRunner;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This detector identify if @Enumerated(EnumType.ORDINAL) is used
 * in JPA. This causes inflexibility for database column type.
 * <p>
 * More learn...
 * https://www.baeldung.com/jpa-persisting-enums-in-jpa#ordinal
 * https://stackoverflow.com/questions/6789342/jpa-enum-ordinal-vs-string
 *
 * @author Yoo Chul Kim
 */
public class InefficientEnumsPersistenceDetector implements Detector {
    private final BugReporter bugReporter;
    private static final String INEFFICIENT_ENUMS_PERSISTENCE_TYPE = "INEFFICIENT_ENUMS_PERSISTENCE";

    private static final String TARGET_ANNOTATION = "Ljavax/persistence/Enumerated";

    public InefficientEnumsPersistenceDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
        JavaClass javaClass = classContext.getJavaClass();
        List<String> annotations = getAnnotationList(javaClass);

        // TODO: Detect Annotation
    }

    // Source from https://github.com/find-sec-bugs/find-sec-bugs/blob/master/findsecbugs-plugin/src/main/java/com/h3xstream/findsecbugs/spring/SpringEntityLeakDetector.java
    private List<String> getAnnotationList(JavaClass javaClass) {
        ArrayList<String> annotations = new ArrayList<>();
        for (AnnotationEntry annotationEntry: javaClass.getAnnotationEntries()) {
            annotations.add(annotationEntry.getAnnotationType());
        }
        try {
            for (JavaClass subclass: javaClass.getSuperClasses()) {
                annotations.addAll(getAnnotationList(subclass));
            }
        } catch (Exception e) {
        }

        return annotations;
    }

    @Override
    public void report() {

    }
}
