package basic;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import test.SampleDAO;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
public class Matcher {

    private SampleDAO dao;

    @Before
    public void setUp() {
        dao = Mockito.mock(SampleDAO.class);
        when(dao.findOne(anyInt())).thenReturn("ok param");
        when(dao.getByName(anyString())).thenReturn("ok");
    }

    @Test
    public void test() {
        System.out.println(dao.findOne(10));
        System.out.println(dao.getByName("123456"));
        /**
         * if any function that match the verify argument matcher has been called .
         * the verify will pass.
         */
        verify(dao).findOne(anyInt());
        verify(dao).getByName(argThat(string -> string.length() > 5));
    }

    @Test
    public void verifyInvocationTime() {
        System.out.println(dao.findOne(10));
        System.out.println(dao.findOne(10));
        System.out.println(dao.findOne(10));
        verify(dao, times(3)).findOne(10);
    }
}
