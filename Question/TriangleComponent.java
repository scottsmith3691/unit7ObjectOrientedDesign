import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class TriangleComponent extends JComponent
{
    
    //private Triangle tri;
    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        tri = 
    }

  public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }

  public void moveRectangle(int x, int y)
    {
        point1.setLocation(x, y);
        point2.setLocation(x, y);
        point3.setLocation(x, y);
        repaint();
    }

}
