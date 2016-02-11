import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveRectangle(x, y);
        }
    }

    public TriangleFrame()
    {
        scene = new RectangleComponent();
        add(scene);
        
        MouseListener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

}
