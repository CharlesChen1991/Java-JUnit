package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class algorithm1Test {

    private Algorithm1 algorithm1 = new Algorithm1();

    @Test
    public void add() throws Exception {
        assertEquals(algorithm1.add(1, 1), 2);
    }

    @Test
    public void minus() throws Exception {
        assertEquals(algorithm1.minus(1, 1), 0);
    }

}