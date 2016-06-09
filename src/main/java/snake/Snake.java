/*
 * Snake.java
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
    // public enum Direction { UP, RIGHT, DOWN, LEFT }
    // private Direction direction;
    
    public Snake() {
        head = new Coordinate(1, 1);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
    }
    
    public int getScore() { return size; }
    
    // For these turn methods: the user pressing any key will prompt these methods
    /*
    public void turnUp() {
      direction = UP; // not exactly sure if i can hold a specific enum value and change it in a field?
    }
    
    public void turnRight() {
      direction = RIGHT;
    }
    
    public void turnDown() {
      direction = DOWN;
    }
    
    public void turnLeft() {
      direction = LEFT;
    }
    
    public Coordinate findMoveCoordinate() { // returns the coordinate that the snake should move to next
        switch(direction) {
            case UP:
                return new Coordinate(head.getRow(), head.getCol() - 1);
                break;
            case RIGHT:
                return new Coordinate(head.getRow() + 1, head.getCol());
                break;
            case DOWN:
                return new Coordinate(head.getRow(), head.getCol() + 1);
                break;
            case LEFT:
                return new Coordinate(head.getRow() - 1, head.getCol());
            default:
                return null;
                break;
        }
    }
    
    public void move() {
        Coordinate next = findMoveCoordinate();
        if (next.isSnakeSegment()); // need method to test if something is a snake segment or not
                                    // also: how to deal with ending the game?
        else if (next.equals(food)) // not sure where the food variable is at this point
            snake.grow();
        else if (next.getRow() < 0 || next.getCol() < 0 || next.getRow() >= grid.width() 
                     || next.getCol() >= grid.getHeight());  // are there fixed values for width and height that i should plug in
        //throw some error or end game or whatever
        else {
            snake.remove(tail); //this unlinks it, but we need to return it to the grid color
            snake.add(0, next);
            head = next;
            tail = snake.getNth(size - 1); //resets tail to the new last segment // getNth is a LinkedList method?
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