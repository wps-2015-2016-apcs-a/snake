/**
 * Buttons.java
 *
 * @author APCS A Block 2015-2016
 * @authors Misha Pilipchuk
 *
 */

package snake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener{


    ///////////////////////////FIELD///////////////////////////////////////
    private JButton y;
    private JButton n;

    /////////////////////////////////CONSTRUCTORS////////////////////////////////////
    public Buttons() {

        y = new JButton("New Game");
        y.addActionListener(this);
    }

    /////////////////////////////////////////METHODS//////////////////////////////////////
    public void actionPerformed(ActionEvent e) {

    }
}


