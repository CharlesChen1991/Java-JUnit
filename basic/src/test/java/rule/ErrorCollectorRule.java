package rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Created by hao.e.chen on 9/5/2017.
 * The ErrorCollector Rule allows execution of a test to continue after the first problem is found
 * (for example, to collect all the incorrect rows in a table, and report them all at once):
 */
public class ErrorCollectorRule {
    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        collector.addError(new Throwable("first thing went wrong"));
        collector.addError(new Throwable("second thing went wrong"));
        //  collector.addError(new Throwable("third thing went wrong"));
    }
}
