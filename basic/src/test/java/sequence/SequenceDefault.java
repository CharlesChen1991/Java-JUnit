package sequence;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class SequenceDefault {
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
