package parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
@RunWith(Parameterized.class)
public class DataRunTimeInjection {
    private int input;
    private int expected;

    public DataRunTimeInjection(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    /**
     * Name value is to specify the test case name
     *
     * @return
     */
    @Parameterized.Parameters(name = "{index}: fib({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {9, 9}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}
        });
    }

    @Test
    public void test() {
        System.out.println(this.input + "-" + this.expected);
    }

}
