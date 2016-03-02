import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Color;
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
    Color cc;
    
    
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        cc = Color.RED;
    }
    
    public Color getColor()
    {
        return cc;
    }
    
    public Dimension getPreferredSize()
    {
        dim = new Dimension(600, 600);
        return dim;
    }
    
    public void pickColor()
    {
        cc=JColorChooser.showDialog(this, "Choose Color" , cc);
        
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
            //canvas.setTriangle(x, y);
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
        
    }
}
