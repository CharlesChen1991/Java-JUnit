package rule;

import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static org.hamcrest.core.Is.is;
import static org.junit.Assume.assumeThat;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class TestWatcherRules {
    @Rule
    public final TestRule rule = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            System.out.println("apply:" + description.getDisplayName() + "-" + description.getMethodName());
            return super.apply(base, description);
        }

        /**
         * Invoked when a test succeeds
         *
         * @param description
         */
        @Override
        protected void succeeded(Description description) {
            System.out.println("succeeded:" + description.getDisplayName() + "-" + description.getMethodName());
            super.succeeded(description);
        }

        /**
         * Invoked when a test fails
         *
         * @param e
         * @param description
         */
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("failed:" + description.getDisplayName() + "-" + description.getMethodName());
            super.failed(e, description);
        }

        /**
         * Invoked when a test is skipped due to a failed assumption.
         *
         * @param e
         * @param description
         */
        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            System.out.println("skipped:" + description.getDisplayName() + "-" + description.getMethodName());
            super.skipped(e, description);
        }

        /**
         * Invoked when a test is about to start
         *
         * @param description
         */
        @Override
        protected void starting(Description description) {
            System.out.println("starting:" + description.getDisplayName() + "-" + description.getMethodName());
            super.starting(description);
        }

        /**
         * Invoked when a test method finishes (whether passing or failing)
         *
         * @param description
         */
        @Override
        protected void finished(Description description) {
            System.out.println("finished:" + description.getDisplayName() + "-" + description.getMethodName());
            super.finished(description);
        }
    };

    @Test
    public void success() {
        System.out.println("success");
    }

    @Test
    public void fail() {
        System.out.println("fail");
        fail();
    }

    @Test
    public void skip() {
        System.out.println("skipping");
        assumeThat("a", is("b"));
        System.out.println("not skipped");
    }
}
