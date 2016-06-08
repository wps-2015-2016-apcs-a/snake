/*
 * Coordinate.java
 *
 * @author 2015-2016 APCS A-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package snake;

/**
 * Coordinate class for the grid.
 */
public class Coordinate {

    /** Holds row. */
    private int row;
    /** Holds column. */
    private int col;

    /** Construct a Coordinate.
     */
    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /** Return row of this coordinate.
     *
     * @return row of this coordinate
     */
    public int getRow() { return row; }

    /** Return column of this coordinate.
     *
     * @return column of this coordinate
     */
    public int getCol() { return col; }

    /** Return true if that is non-null, rows are equal, and cols are equal.
     * 
     * @return this.row == that.row && this.col == that.col
     */
    public boolean equals(Coordinate that) {
//        if (this == that) return true;
        if (that == null) return false;
//        if (!(that instanceof Coordinate)) return false;
        return this.getRow() == that.getRow()
            && this.getCol() == that.getCol();
    }

    /** Returns a hash code value for this object.
     * 
     * @return hash code value for this.
     */
    public int hashcode() {
        return (row * 17 + col) * 17;
    }

    /** Return String representation of this.
     *
     * @return String representation of this
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        return sb.append(row).append(",").append(col).append(")").toString();
    }
    /** Return true if that is non-null and this is adjacent to that.
     *
     * @return true if this is adjacent to that, otherwise false
     */
    public boolean isAdjacent(Coordinate that) {
        if (that == null) return false;
        int xDiff = Math.abs(this.getCol() - that.getCol());
        int yDiff = Math.abs(this.getRow() - that.getRow());
        return this.getRow() == that.getRow() && xDiff == 1
            || this.getCol() == that.getCol() && yDiff == 1;
    }
}