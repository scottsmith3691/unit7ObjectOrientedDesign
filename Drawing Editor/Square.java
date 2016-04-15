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
    
    private Rectangle2D.Double square;
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        
        square = new Rectangle2D.Double(center.getX()+(radius/2), center.getY()+(radius/2),radius,radius);
    }

    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(getColor());
        square = new Rectangle2D.Double(getCenter().getX()+(getRadius()/2), getCenter().getY()+(getRadius()/2),getRadius(),getRadius());
        if(filled==true)
        {
        g2.fill(square);
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
