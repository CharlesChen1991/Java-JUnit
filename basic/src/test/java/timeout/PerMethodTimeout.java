package timeout;

import org.junit.Test;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class PerMethodTimeout {
    @Test(timeout = 1000)
    public void testWithTimeout() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
