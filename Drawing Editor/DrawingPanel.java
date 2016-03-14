import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.geom.Point2D;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private Dimension dim;
    private Color cc;
    
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
        shapes.add(new Circle(new Point2D.Double(150,150), 150, cc));
    }
    
    public void addSquare(Graphics2D g)
    {
        //Square square = new Square();
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
       
        super.paintComponent(g);
        
        //for(Shape shape : shapeList)
        {
            //shape.draw(g2, true);
        }
        repaint();
    }
    
        public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
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
