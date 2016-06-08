/*
 * CoordinateTest.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

import org.junit.*;

/**
 * Unit test for Coordinate.
 */
public class CoordinateTest {

    private Coordinate c0, c1, c2, c3, c4, c5, c6, c7, c8, c9;
    private Coordinate[] actual, expected;

    /**
     * Set up before every test.
     */
    @Before
    public void setUp() {
        c0 = new Coordinate(0, 0);

        c1 = new Coordinate(0, 47);
        c2 = new Coordinate(47, 0);
        c3 = new Coordinate(47, 47);
        c4 = new Coordinate(0, 47);

        c5 = new Coordinate(3, 6);
        c6 = new Coordinate(4, 6);
        c7 = new Coordinate(3, 7);
        c8 = new Coordinate(4, 7);
    }

    /**
     * Tear down after every test.
     */
    @After
    public void tearDown() {
        c0 = c1 = c2 = c3 = c4 = c5 = c6 = c7 = c8 = c9 = null;
        actual = expected = null;
    }

    /**
     * Test accessors.
     */
    @Test
    public void testAccessors() {
        int[] expectedRow = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
        int[] expectedCol = new int[] { 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, };
        assert expectedRow.length == expectedCol.length : "testAccessors: bad data";
        for (int i = 0; i < expectedRow.length; i++) {
            int row = expectedRow[i], col = expectedCol[i];
            Coordinate c = new Coordinate(row, col);
            Assert.assertTrue("(" + row + "," + col + ") != " + c + ".",
                c.getRow() == row && c.getCol() == col);
        }
        for (int i = 0; i < expectedRow.length; i++) {
            int row = expectedRow[i], col = expectedCol[i];
            Coordinate c = new Coordinate(row, col);
            Assert.assertFalse("(" + row + "," + col + ") == " + c + ".",
                c.getRow() == col && c.getCol() == row);
        }
    }
    /**
     * Test equals.
     */
    @Test
    public void testEquals() {
        expected = new Coordinate[] { c1, c2, c3, c1, };
        actual = new Coordinate[] { c1, c2, c3, c4, };
        assert expected.length == actual.length : "testEquals: bad data";
        for (int i = 0; i < expected.length; i++)
            Assert.assertTrue(expected[i] + " != " + actual[i] + ".",
                expected[i].equals(actual[i]));
        expected = new Coordinate[] { c1, c1, c2, c2, c3, };
        actual = new Coordinate[] { c2, c3, c3, c4, c4, };
        for (int i = 0; i < expected.length; i++)
            Assert.assertFalse(expected[i] + " != " + actual[i] + ".",
                expected[i].equals(actual[i]));
    }

    /**
     * Test isAdjacent.
     */
    @Test
    public void testIsAdjacent() {
        expected = new Coordinate[] { c5, c6, c8, c7, c5, c7, c8, c6, };
        actual = new Coordinate[] { c6, c8, c7, c5, c7, c8, c6, c5, };
        assert expected.length == actual.length : "testisAdjacent: bad data";
        for (int i = 0; i < expected.length; i++)
            Assert.assertTrue("!(" + expected[i] + ").isAdjacent(" + actual[i] + ").",
                expected[i].isAdjacent(actual[i]));
        expected = new Coordinate[] { c0, c0, c5, c6, c7, c8, };
        actual = new Coordinate[] { c0, c3, c8, c7, c6, c5, };
        for (int i = 0; i < expected.length; i++)
            Assert.assertFalse("(" + expected[i] + ").isAdjacent(" + actual[i] + ").",
                expected[i].isAdjacent(actual[i]));
    }
}
