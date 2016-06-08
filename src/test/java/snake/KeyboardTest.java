/*
 * KeyboardTest.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Keyboard.
 */
public class KeyboardTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public KeyboardTest(String testName) {
        super(testName);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(KeyboardTest.class);
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }
}
