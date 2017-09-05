package logic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class SwitchCaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private Map<Integer, String> roleMesMap = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        roleMesMap.put(1, "Dear");
        roleMesMap.put(2, "Hello");
        roleMesMap.put(3, "Hey");
    }

    @Test
    public void sayHello() throws Exception {
        SwitchCase sc = new SwitchCase();
        roleMesMap.forEach((role, mes) -> {
            assertEquals(mes, sc.sayHello(role));
        });
        try {
            sc.sayHello(4);
            fail("No Exception Throw then failed");
        } catch (ClassCastException e) {
            assertThat(e.getMessage(), is("What?"));
        }
    }
}