import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.*;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 800;
    
    private ControlPanel controls;
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        
        add(controls, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor de = new DrawingEditor();
    }


}
