package basic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class BasicMokito {

    private List testList;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        testList = Mockito.mock(List.class);
        Mockito.when(testList.get(0)).thenReturn("");
        Mockito.when(testList.get(1)).thenThrow(new IndexOutOfBoundsException("exceeded"));
    }

    @Test
    public void test() {
        assertEquals(testList.get(0), "");
        assertNull(testList.get(2));
        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage(startsWith("exceeded"));
        testList.get(1);
    }

}
