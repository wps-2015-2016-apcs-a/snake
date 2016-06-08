/*
 * SnakeTimerTest.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Nathan Li <nathanli6065@gmail.com>
 * @author Misha Pilipchuk <misha@pilipchuk.org>
 */
package snake;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for SnakeTimer.
 */
public class SnakeTimerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SnakeTimerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SnakeTimerTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }
}
