package sequence;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by hao.e.chen on 9/5/2017.
 * Leaves the test methods in the order returned by the JVM. This order may vary from run to run.
 */
@FixMethodOrder(MethodSorters.JVM)
public class Sequence_JVM {
    @Test
    public void testA() {
        System.out.println("first");
    }

    @Test
    public void testB() {
        System.out.println("second");
    }

    @Test
    public void testC() {
        System.out.println("third");
    }
}
