package rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * Created by hao.e.chen on 9/5/2017.
 * ExternalResource is a base class for Rules (like TemporaryFolder) that set up an external resource before a test
 * (a file, socket, server, database connection, etc.), and guarantee to tear it down afterward. Here use a counting
 * for example.
 */
public class ExternalResourceRules {

    private int counting = 0;

    @Rule
    public final ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            counting++;
            System.out.println("before [" + counting + "]");
        }

        ;

        @Override
        protected void after() {
            counting++;
            System.out.println("after [" + counting + "]");
        }

        ;
    };

    @Test
    public void test1() {
        System.out.println("test1 [" + counting + "]");
    }

    @Test
    public void test2() {
        System.out.println("test2 [" + counting + "]");
    }
}
