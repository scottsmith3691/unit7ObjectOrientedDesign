import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
public class TriangleComponent extends JComponent
{
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    
    private Rectangle box;

    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT); 
    }


    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    public void moveRectangle(int x, int y)
    {
        box.setLoctaion(x, y);
        repaint();
    }

}
