/*
 * Buttons.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ella Jenke
 * @author Becca Mestechkin
 */
package snake;

import java.util.*;

public class Snake {
    
    private Grid grid;
    private LinkedList<Coordinate> snake;
    private int size;
    private Coordinate head, tail;
    // private Direction direction;
/* 
    public Snake() {
        head = new Coordinate(1, 1);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
    }
    
    public int getScore() { return size; }
    
    public Coordinate findMoveCoordinate() { // returns the coordinate that the snake should move to next
        if (direction == left)
            return new Coordinate(head.getRow() - 1, head.getCol());
        else if (direction == right)
            return new Coordinate(head.getRow() + 1, head.getCol());
        else if (direction == up)
            return new Coordinate(head.getRow(), head.getCol() - 1);
        else if (direction == down)
            return new Coordinate(head.getRow(), head.getCol() + 1);
        else
            return null; //is this necessary..?
    }
    
    public void move() {
        Coordinate next = findMoveCoordinate();
        if (next.isSnakeSegment()); //error? end game?
        else if (next.equals(food))
            snake.grow();
        else if (next.getRow() < 0 || next.getCol() < 0 || next.getRow() >= grid.width() 
                     || next.getCol() >= grid.getHeight());
        //throw some error or end game or whatever
        else {
            snake.remove(tail); //this unlinks it, but we need to return it to the grid color
            snake.add(0, next);
            head = next;
            tail = snake.getNth(size - 1); //resets tail to the new last segment
        }
    }
    
    public void grow() { // we could just make this part of the move method
        Coordinate newSegment = findMoveCoordinate();
        snake.add(0, newSegment);
        size++;
        head = newSegment;
    }
*/
}