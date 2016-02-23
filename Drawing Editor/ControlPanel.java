import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JPanel panel;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.button = new JButton("Pick Color");
        panel.add(button);
        
        this.button2 = new JButton("Add Circle");
        panel.add(button2);
        
        this.button3 = new JButton("Add Square");
        panel.add(button2);
        
        
    }
}
