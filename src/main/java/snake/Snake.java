/*
 * Snake.java
 *
 * @author 2015-2016 APCS A-Block
 * @author Ella Jenke
 * @author Becca Mestechkin
 */
package snake;

import java.util.*;
import java.awt.*;

public class Snake {
    
    private Grid grid;
    private LinkedList<Coordinate> snake;
    private int size;
    private Coordinate head, tail;
    private int direction;
    
    public Snake() {
        head = new Coordinate(1, 1);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
    }
    
    public int getScore() { return size; }
    
    // For these turn methods: the user pressing any key will prompt these methods
    public void turnUp() {
      direction = 1;
    }
    
    public LinkedList<Coordinate> getSnake() { return snake; }
    
    public void turnRight() {
      direction = 2;
    }
    
    public void turnDown() {
      direction = 3;
    }
    
    public void turnLeft() {
      direction = 4;
    }
    
    public Coordinate findMoveCoordinate() { // returns the coordinate that the snake should move to next
        if (direction == 1) return new Coordinate(head.getRow(), head.getCol() - 1);
        else if (direction == 2) return new Coordinate(head.getRow() + 1, head.getCol());
        else if (direction == 3) return new Coordinate(head.getRow(), head.getCol() + 1);
        else if (direction == 4) return new Coordinate(head.getRow() - 1, head.getCol());
        else return null;
    }
    
    public void move() {
        Coordinate next = findMoveCoordinate(); // how to test if its part of the snake
        if (snake.contains(next));
            // Game.gameOver(); // need method to test if something is a snake segment or not
        // else if (next.equals(Grid.getFood())) // not sure where the food variable is at this point
        //     grow();
        // else if (Grid.testWall())
            // Game.gameOver();
        else {
            snake.remove(tail);
            snake.add(0, next);
            head = next;
            tail = snake.get(size - 1); //resets tail to the new last segment
        }
    }
    
    public void grow() {
        Coordinate newSegment = findMoveCoordinate();
        snake.add(0, newSegment);
        // Grid.addFood();
        size++;
        head = newSegment;
    }
}