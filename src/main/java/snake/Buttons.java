/**
 * Buttons.java
 *
 * @author APCS A Block 2015-2016
 * @author Misha Pilipchuk
 *
 */

package snake;

import javax.swing.*;




public class Buttons{


    ///////////////////////////FIELD///////////////////////////////////////
    private String scoreKeep;
    private String instructions;
    private JTextField scoreBox;
    private JTextField instructionBox;

    /////////////////////////////////CONSTRUCTORS////////////////////////////////////
    public Buttons(){
        scoreKeep = "Score: " + Game.getSnake().getScore();
        instructions = "Press space bar to start and pause, r to restart, arrows to move";
        scoreBox = new JTextField(scoreKeep);
        instructionBox = new JTextField(instructions);
    }

    /////////////////////////////////////////METHODS//////////////////////////////////////
    public JTextField getScoreBox(){ return scoreBox;}
    public JTextField getInstructionBox() { return instructionBox;}
}
