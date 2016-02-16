import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class RectangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent scene;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveRectangle(x, y);
        }
        public void mouseReleased(MouseEvent event)
        {
        }
        public void mouseClicked(MouseEvent event)
        {
        }
        public void mouseEntered(MouseEvent event)
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
    }

    public RectangleFrame()
    {
        scene = new RectangleComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

}
