import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.geom.Point2D;
import javax.swing.*;
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
        repaint();
    }
    
    public void addSquare(Graphics2D g)
    {
        shapes.add(new Square(new Point2D.Double(350,350), 150, cc));
        repaint();
    }
    
    public ArrayList getShapeList()
    {
        return shapes;
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
       
        super.paintComponent(g);
        
        for( int i = 0; i<shapes.size(); i++)
        {
            shapes.get(i).draw(g2, true);
        
        }
        repaint();
    }
    
        public class MouseEventListener implements MouseMotionListener
    {
        private ArrayList<Shape> shapes1;
        private boolean pressed;
        private Point2D.Double point = new Point2D.Double();
        public void mouseDragged(MouseEvent event)
        {
            shapes1 = getShapeList();
            point.setLocation(event.getX(), event.getY());
            for( int x = 0; x<shapes1.size(); x++)
            {
                shapes1.get(x).translate(event.getX(), event.getY());
            }
            repaint();
            
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}
