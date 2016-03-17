import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;
    private Rectangle2D.Double square;
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        
        center = center;
        radius = radius;
        color = color;
        square = new Rectangle2D.Double(center.getX()+(radius/2), center.getY()+(radius/2),radius,radius);
    }

    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius(double r)
    {
        radius=r;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(center.getX()+(radius/2), center.getY()+(radius/2),radius,radius);
        if(filled==true)
        {
        g2.setColor(color);
        g2.draw(square);
    }
    else
    {
        g2.draw(square);
    }
    }
        
    public void translate(double x, double y)
    {
        int xxx=0;
    }

}
