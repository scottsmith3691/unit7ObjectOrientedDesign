import javax.swing.JFrame;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private ControlPanel controls;
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor de = new DrawingEditor();
    }


}
