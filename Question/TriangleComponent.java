import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
public class TriangleComponent extends JComponent
{
    
    private Line2D.Double point1;
    private Line2D.Double point2;
    private Line2D.Double point3;
    private int firstx;
    private int firsty;
    private int secondx;
    private int secondy;
    private int thirdx;
    private int thirdy;
    private int count=1;;
    
    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        point1= new Line2D.Double();
        point2= new Line2D.Double();
        point3= new Line2D.Double();
    }

  public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if(count==1)
        {
            g2.draw(point1);
        }
        else if( count == 2)
        {
        g2.draw(point2);
       }
       
       else if( count == 3)
       {
       g2.draw(point3);
    }
    }

  public void setTriangle(int x, int y)
    {
        
        if(count == 1)
        {
            firstx = x;
            firsty = y;
            count++;
            point1.setLine(firstx, firsty, firstx+5, firsty+5);
            repaint();
        }
        else if( count == 2)
        {
            secondx = x;
            secondy = y;
            count++;
            point2.setLine(firstx, firsty, secondx, secondy);
            
            repaint();
        }
        else if (count == 3)
        {
            thirdx = x;
            thirdy = y;
            count++;
           
            point3.setLine(secondx, secondy, thirdx, thirdy);
            repaint();
        }
    }
    
 
}
