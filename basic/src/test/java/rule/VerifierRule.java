package rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class VerifierRule {

    public static String result = "";

    @Rule
    public final Verifier verifier = new Verifier() {
        @Override
        public Statement apply(Statement base, Description description) {
            System.out.println("Apply");
            return super.apply(base, description);
        }

        @Override
        protected void verify() {
            VerifierRule.result = "Verified";
        }
    };

    @Test
    public void example() {
        System.out.println("Triggered test");
    }

    @Test
    public void verifierRunsAfterTest() {
        System.out.println("Verifying");
        assertThat(testResult(VerifierRule.class), isSuccessful());
        assertEquals("Verified", VerifierRule.result);
    }
}
