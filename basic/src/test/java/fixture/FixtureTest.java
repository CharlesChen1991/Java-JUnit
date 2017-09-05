package fixture;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hao.e.chen on 9/5/2017.
 */
public class FixtureTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test() {
        System.out.println("Testing 1");
    }

    @Test
    public void test2() {
        System.out.println("Testing2");
    }

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame() {
        assertThat(1, is(1));
    }
}
