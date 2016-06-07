
import java.awt.*;
import javax.swing.*;

public class Window extends Grid
{
    
    private JFrame f;
    private JPanel p;
    
    public Window()
    {
        create();
    }
    
    public void drawSquare()
    {
        createGrid();
        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j < 75; j++)
            {
                if (i==0 || i==99 || j==0 || j == 74)
                {
                    g.setColor(Color.GRAY);
                    g.drawRect(i * 8, j * 8, 8, 8);
                }
                else
                {
                    g.setColor(Color.BLACK);
                    g.drawRect(i * 8, j * 8, 8, 8);
                }
                
            }
        }
    }
        
    public void create()
    {
        f = new JFrame("test");
        f.setVisible(true);
        f.setSize(800, 600);
        
        p = new JPanel();
        p.setBackground (Color.BLACK);
        
        f.add(p);
        
    }
    public static void main(String[] args) 
    {
        new Window();
    }
}
