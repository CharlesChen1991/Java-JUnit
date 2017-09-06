package basic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import test.SampleService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class Annotation {
    @Mock
    SampleService service;

    @Before
    public void setUp() {
        when(service.getProfile("Charles")).thenReturn("ABC");
    }

    @Test
    public void test() {
        assertEquals(service.getProfile("Charles"), "ABC");
    }
}
