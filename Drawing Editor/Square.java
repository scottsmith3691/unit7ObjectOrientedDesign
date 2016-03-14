import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.*;
import java.util.*;
import java.awt.geom.Point2D;
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

    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        center = center;
        radius = radius;
        color = color;
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
        
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        double x = center.getX();
        double y = center.getY();
        double leftX = x-radius;
        double leftY = y-radius;
        double rightX = x+radius;
        double rightY = y+radius;
        g2.drawRect((int)leftX, (int)leftY, (int)rightX, (int)rightY);
    }
        
    

}
