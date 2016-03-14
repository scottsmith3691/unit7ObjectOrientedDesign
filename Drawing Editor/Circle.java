import java.awt.geom.*;
import java.awt.*;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    
    private double radius;
    
    private Color color;
    
    private Ellipse2D.Double circle;

    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double cent, double rad, Color col)
    {
        super(cent, rad, col);
        center = cent;
        radius = rad;
        color = col;
    }

  
    public void draw(Graphics g2, boolean filled)
    {
        g2.setColor(color);
        
        //g2.draw(circle);
    }
    
    public void translate(double x, double y)
    {
        double xx= x-(circle.getWidth()/2);
    }

}
