package exception;

import javassist.NotFoundException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.startsWith;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class ExpectedExpRule {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrow() throws NotFoundException {
        TestThing testThing = new TestThing();
        thrown.expect(NotFoundException.class);
        thrown.expectMessage(startsWith("some Message"));
        testThing.chuck();
    }

    private class TestThing {
        public void chuck() throws NotFoundException {
            throw new NotFoundException("some Message");
        }
    }
}

