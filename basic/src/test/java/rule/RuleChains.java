package rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import static org.junit.Assert.assertTrue;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class RuleChains {
    @Rule
    public final TestRule chain = RuleChain
            .outerRule(new CustomRule("outer rule"))
            .around(new CustomRule("middle rule"))
            .around(new CustomRule("inner rule"));

    @Test
    public void example() {
        assertTrue(true);
    }
}
