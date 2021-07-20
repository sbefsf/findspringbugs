package com.sbefsf.findspringbugs.badpractice;

import edu.umd.cs.findbugs.*;
import edu.umd.cs.findbugs.ba.ClassContext;
import edu.umd.cs.findbugs.bcel.AnnotationDetector;
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
public class InefficientEnumsPersistenceDetector extends AnnotationDetector {
    public static final String INEFFICIENT_ENUMS_PERSISTENCE_TYPE = "INEFFICIENT_ENUMS_PERSISTENCE";
    final BugReporter bugReporter;

    public InefficientEnumsPersistenceDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visit(Method obj) {
        // TODO: Implement detector with strategy below
        // Find annotations which have bytecode of "@Ljavax/persistence/Enumerated;(value=Ljavax/persistence/EnumType;.ORDINAL)"
    }
}
