package rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class CustomRule implements TestRule {
    private String mes;

    public CustomRule(String message) {
        mes = message;
    }

    /**
     * Modifies the method-running {@link Statement} to implement this
     * test-running rule.
     *
     * @param base        The {@link Statement} to be modified
     * @param description A {@link Description} of the test implemented in {@code base}
     * @return a new statement, which may be the same as {@code base},
     * a wrapper around {@code base}, or a completely new Statement.
     */
    @Override
    public Statement apply(Statement base, Description description) {
        System.out.println(mes);
        System.out.println(base);
        return base;
    }
}
