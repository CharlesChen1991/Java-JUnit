package basic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import test.SampleService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class SpyUsage {
    SampleService service = new SampleService();
    SampleService spyTest;

    @Before
    public void setUp() {
        spyTest = spy(service);
        when(spyTest.getProfile("Charles")).thenReturn("ABC");
    }

    @Test
    public void test() {
        assertEquals(spyTest.getProfile("Charles"), "ABC");
        assertEquals(spyTest.getResult("test"), "calling real method");
    }
}
