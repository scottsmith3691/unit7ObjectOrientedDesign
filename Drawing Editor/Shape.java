import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
import java.util.*;
/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    Point2D.Double center1;
    double rad;
    Color c;

    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        center1 = center;
        rad = radius;
        c = color;
    }
    
    public Point2D.Double getCenter()
    {
        
        return center1;
    }
    
    public Color getColor()
    { 
        return c;
    }
    
    public double getRadius()
    {
        return rad;
    }
    
    public void move(double x, double y)
    {
        center1.setLocation(x, y);
    }
    
    public void setRadius(double r)
    {
        rad = r;
    }
    
    abstract boolean isInside(Point2D.Double point);
    
    
    public abstract void draw(Graphics2D g2, boolean filled);

    
 

}
