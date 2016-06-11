/**
 * Buttons.java
 *
 * @author APCS A Block 2015-2016
 * @authors Misha Pilipchuk and Nathan Li
 *
 */

package snake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    ///////////////////////////FIELD///////////////////////////////////////
    private JButton Up = new JButton("Up");
    private JButton Right = new JButton("Right");
    private JButton Left = new JButton("Left");
    private JButton Down = new JButton("Down");

    /////////////////////////////////CONSTRUCTORS////////////////////////////////////
    public Buttons() {
        Up.addActionListener(new ActionListener() {
                                 public void actionPerformed(ActionEvent e) {
                                     System.out.println("Turn upwards");
                                 }
                             }
        );
        Right.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("Turn right");
                                    }
                                }
        );
        Left.addActionListener(new ActionListener() {
                                   public void actionPerformed(ActionEvent e) {
                                       System.out.println("Turn left");
                                   }
                               }
        );
        Down.addActionListener(new ActionListener() {
                                   public void actionPerformed(ActionEvent e) {
                                       System.out.println("Turn down");
                                   }
                               }
        );
    }
}


