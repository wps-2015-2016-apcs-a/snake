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

    private Coordinate head, tail;
    private List<Coordinate> snake;
    private int size;
    private Direction direction;

    public Snake() {
        head = tail = new Coordinate(3, 3);
        snake = new LinkedList<Coordinate>();
        snake.add(head);
        size++;
        direction = Direction.RIGHT;
    }

    public int getScore() { return size; }
    public List<Coordinate> getSnake() { return snake; }

    private void setDirection(Direction direction) { this.direction = direction; }
    /** The user pressing an arrow key will prompt the corresponding method to change direction. */
    public void turnUp() { setDirection(Direction.UP); }
    public void turnRight() { setDirection(Direction.RIGHT); }
    public void turnDown() { setDirection(Direction.DOWN); }
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
            for (int i = 0; i < 3; i++) 
                grow();
            Game.getGrid().addFood();
        }
        else {
            snake.remove(tail);
            snake.add(0, next);
            head = next;
            tail = snake.get(size - 1); //resets tail to the new last segment
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
    }
}
