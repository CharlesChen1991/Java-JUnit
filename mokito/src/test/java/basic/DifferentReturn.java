package basic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import test.SampleService;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.when;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class DifferentReturn {
    @Mock
    SampleService service;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        when(service.getProfile("Charles")).thenReturn("a", "b", "c").thenThrow(new RuntimeException("test"));
    }

    @Test
    public void test() {
        assertEquals(service.getProfile("Charles"), "a");
        assertEquals(service.getProfile("Charles"), "b");
        assertEquals(service.getProfile("Charles"), "c");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(contains("test"));
        assertEquals(service.getProfile("Charles"), "a");
    }
}
