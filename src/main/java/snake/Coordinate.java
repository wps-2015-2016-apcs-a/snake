/*
 * Coordinate.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

/**
 * Coordinate class for the {@link Grid}.
 */
public class Coordinate {

    /** Holds row. */
    private int row;
    /** Holds column. */
    private int col;

    /**
     * Constructs a {@link Coordinate}.
     *
     * @param row row of this Coordinate
     * @param col col of this Coordinate
     */
    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Returns row of this {@link Coordinate}.
     *
     * @return row of this Coordinate
     */
    public int getRow() { return row; }

    /**
     * Returns column of this {@link Coordinate}.
     *
     * @return column of this Coordinate
     */
    public int getCol() { return col; }

    /**
     * Returns true if <code>that</code> is non-null and <code>this</code> 
     * is adjacent to <code>that</code>.
     *
     * @param that {@link Coordinate} that is potentially adjacent to this
     * @return true if this is adjacent to that, otherwise false
     */
    public boolean isAdjacent(Coordinate that) {
        if (that == null) return false;
        int xDiff = Math.abs(this.getCol() - that.getCol());
        int yDiff = Math.abs(this.getRow() - that.getRow());
        return this.getRow() == that.getRow() && xDiff == 1
            || this.getCol() == that.getCol() && yDiff == 1;
    }

    /**
     * Returns true if <code>that</code> is non-null and row and col are equal. 
     * (Not done completely in accordance with 
     * <a href="http://www.javapractices.com/topic/TopicAction.do?Id=17">overriding</a>
     * <code>.equals</code> in {@link Object}).
     *
     * @param that {@link Coordinate} who's state is to be compared with <code>this</code>
     * @return this.row == that.row &amp;&amp; this.col == that.col
     */
    public boolean equals(Coordinate that) {
        return that != null
            && this.getRow() == that.getRow()
            && this.getCol() == that.getCol();
    }

    /**
     * Return {@link String} representation of <code>this</code>.
     *
     * @return String representation of this
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        return sb.append(row).append(",").append(col).append(")").toString();
    }
}