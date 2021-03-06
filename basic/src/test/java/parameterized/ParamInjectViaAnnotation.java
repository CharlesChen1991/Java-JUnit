package parameterized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
@RunWith(Parameterized.class)
public class ParamInjectViaAnnotation {
    @Parameter // first data value (0) is default
    public /* NOT private */ int fInput;
    @Parameter(1)
    public /* NOT private */ int fExpected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}
        });
    }

    @Test
    public void test() {
        System.out.println(this.fInput + "-" + this.fExpected);
    }

}
