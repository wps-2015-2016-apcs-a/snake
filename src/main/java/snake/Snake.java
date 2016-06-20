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

    /** Direction is an enum for the four directions. */
    public static enum Direction { UP, RIGHT, DOWN, LEFT, };

    /** The first and last segment of the snake. */
    private Coordinate head, tail;
    /** The LinkedList of Snake segments. */
    private List<Coordinate> snake;
    /** The length of the snake. */
    private int size;
    /** Holds the direction of the snake. */
    private Direction direction;
    /** Used in the move method to see how many more segments the snake needs to add. */
    public int grow;
    /** The amount the snake grows by. */
    public static final int GROW_COUNT = 3;
    
    /** Constructs the snake. */
    public Snake() {
        head = tail = new Coordinate(3, 3);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
        direction = Direction.RIGHT;
    }

    /** Returns the size of the snake, used to calculate the score. */
    public int getScore() { return size; }
    /** Returns {@link List} of snake segments, aka the snake itself. */
    public List<Coordinate> getSnake() { return snake; }
    /** Returns the first segment of the snake. */
    public Coordinate getHead() { return head; }

    /** Sets the direction of the snake based on user input. */
    private void setDirection(Direction direction) { 
      if (Game.isRunning()) 
          this.direction = direction; 
    }
    /** Turns the snake up. */
    public void turnUp() { setDirection(Direction.UP); }
    /** Turns the snake right. */
    public void turnRight() { setDirection(Direction.RIGHT); }
    /** Turns the snake down. */
    public void turnDown() { setDirection(Direction.DOWN); }
    /** Turns the snake left. */
    public void turnLeft() { setDirection(Direction.LEFT); }

    /**
     * Returns the {@link Coordinate} that the snake should move to next.
     *
     * @return Coordinate that the snake should move to next
     */
    public Coordinate findMoveCoordinate() {
        Coordinate moveCoordinate = head;
        switch (direction) {
            case UP:
                moveCoordinate = new Coordinate(head.getRow() - 1, head.getCol());
                break;
            case RIGHT:
                moveCoordinate = new Coordinate(head.getRow(), head.getCol() + 1);
                break;
            case DOWN:
                moveCoordinate = new Coordinate(head.getRow() + 1, head.getCol());
                break;
            case LEFT:
                moveCoordinate = new Coordinate(head.getRow(), head.getCol() - 1);
                break;
            default:
                break;
        }
        return moveCoordinate;
    }
    /**
     * Checks whether a coordinate object is already in the snake.
     */
    public boolean contains(Coordinate c) {
      for (int i = 0; i < size; i++) {
        if (snake.get(i).equals(c))
          return true;
      }
      return false;
    }
    /**
     * Calls findMoveCoordinate() and tests whether the next movement is valid.
     * 
     * If not, the game ends. Otherwise, the snake either moves or grows.
     */
    public void move() {
        Coordinate next = findMoveCoordinate(); 
        if (contains(next) || Game.getGrid().testWall())
            Game.gameOver(); 
        else if (Game.getGrid().isFood(next)) {
            grow = GROW_COUNT;
            grow();
            Game.getGrid().addFood();
        }
        else {
            if (grow > 0) grow();
            else {
                snake.remove(tail);
                snake.add(0, next);
                head = next;
                tail = snake.get(size - 1); //resets tail to the new last segment
            }
        }
    }
    /**
     * Adds a segment to the snake.
     */
    public void grow() {
        Coordinate newSegment = findMoveCoordinate();
        snake.add(0, newSegment);
        size++;
        head = newSegment;
        grow--;
    }
}
