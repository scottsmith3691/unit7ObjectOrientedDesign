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
        
        circle = new Ellipse2D.Double(center.getX()-radius, center.getY()-radius, radius, radius );
    }
    
    public boolean isInside(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX() - super.getRadius(),
        super.getCenter().getY()-super.getRadius(),
        2*super.getRadius(),
        2*super.getRadius());
        
        return circle.contains(point);
    }
  
    public void draw(Graphics2D g2, boolean filled)
    {
        circle = new Ellipse2D.Double(center.getX()-radius, center.getY()-radius, radius, radius );
        g2.setColor(color);
            if(filled==true)
        {
        
        g2.draw(circle);
        g2.fill(circle);
        }
        else
       {
        g2.draw(circle);
       }
    }
    
    public void translate(double x, double y)
    {
        double xDelta = x - (circle.getWidth()/2);
        double yDelta = y - (circle.getHeight()/2);
        center.setLocation(x, y);
        circle.setFrame(xDelta, yDelta, circle.getWidth(), circle.getHeight());
    }

}
