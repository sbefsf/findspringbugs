package com.sbefsf.findspringbugs.correctness;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.Detector;
import edu.umd.cs.findbugs.ba.ClassContext;

/**
 * This detector identify a JdbcTemplate query method which is an incorrect result set column count.
 * E.g., queryForList is for single column and query is for multiple column.
 *
 * @author Yoo Chul Kim
 */
public class IncorrectResultSetColumnCountDetector implements Detector {
    public static final String INCORRECT_RESULT_SET_COLUMN_COUNT_TYPE = "INCORRECT_RESULT_SET_COLUMN_COUNT";
    private final BugReporter bugReporter;

    public IncorrectResultSetColumnCountDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void visitClassContext(ClassContext classContext) {
    }

    @Override
    public void report() {

    }
}
