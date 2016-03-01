import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JColorChooser;
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
    public DrawingPanel canvas1;
    
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        
        this.button = new JButton("Pick Color");
        add(button);
        
        this.button2 = new JButton("Add Circle");
        add(button2);
        
        this.button3 = new JButton("Add Square");
        add(button3);
        
        button.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        
        canvas1 = canvas;
        
        
        
        
        
    }
    public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
             if (event.getSource() == button)
             {
                canvas1.pickColor();
                }
             else if (event.getSource() == button2)
             {
                 canvas1.addCircle();
                 System.out.println("Button1");
                }
             else if (event. getSource() == button3)
             {
                 canvas1.addSquare();
                 System.out.println("Button2");
                }
    }
}
        ClickListener listener = new ClickListener();
}
