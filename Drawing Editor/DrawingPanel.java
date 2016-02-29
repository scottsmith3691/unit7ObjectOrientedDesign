import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    ArrayList<Shape> shapes;
    Dimension dim;
    
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
    }
    
    public String getColor()
    {
        return "s";
    }
    
    public Dimension getPreferredSize()
    {
        dim = new Dimension(600, 600);
        return dim;
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        //Circle circle = new Circle();
    }
    
    public void addSquare()
    {
        //Square square = new Square();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    
        public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            //scene.setTriangle(x, y);
        }
        public void mouseReleased(MouseEvent event)
        {
        }
        public void mouseClicked(MouseEvent event)
        {
        }
        public void mouseEntered(MouseEvent event)
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == button)
            {
                
            }
            else if (event.getSource() == button2)
            {
                
            }
            else if (event.getSource() == button3)
            {
                
            }
            
        }
    }
}
