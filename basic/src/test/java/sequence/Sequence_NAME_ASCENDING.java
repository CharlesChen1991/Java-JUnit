package sequence;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by hao.e.chen on 9/5/2017.
 * Sorts the test methods by method name, in lexicographic order.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Sequence_NAME_ASCENDING {

    @Test
    public void testC() {
        System.out.println("third");
    }

    @Test
    public void testA() {
        System.out.println("first");
    }

    @Test
    public void testB() {
        System.out.println("second");
    }

}
