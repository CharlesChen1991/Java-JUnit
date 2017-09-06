package basic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import test.SampleService;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
public class Exception {
    SampleService service;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        service = Mockito.mock(SampleService.class);
        doThrow(new RuntimeException("Can not parse it")).when(service).getProfile("Charles");
        when(service.getProfile("Charles gor")).thenReturn("Dear");
    }

    @Test
    public void test() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(contains("Can not parse it"));
        service.getProfile("Charles");
    }

    @Test
    public void test2() {
        service.getProfile("Charles gor");
    }
}
