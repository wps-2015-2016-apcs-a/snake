/*
 * CoordinateTest.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hamcrest.core.AllOf;
import org.hamcrest.core.Is;
import org.hamcrest.CoreMatchers;

/**
 * Unit test for Snake.
 */
public class CoordinateTest extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public CoordinateTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(CoordinateTest.class);
    }

    /**
     * Test constructor & accessors.
     */
    public void testConstructor() {
        Coordinate c1 = new Coordinate(0,47);
        Coordinate c2 = new Coordinate(47,0);
        Coordinate c3 = new Coordinate(47,47);
        Coordinate c4 = new Coordinate(0,47);
        assertEquals("Some value not equals,",
                     new Coordinate[] { c1, c2, c3, c1, },
                     new Coordinate[] { c1, c2, c3, c4, });
        assertThat("Some value equals,",
            new Coordinate[] { c1, c1, c2, },
            not(is(allOf(new Coordinate[] { c2, c3, c3, }))));
    }
}
