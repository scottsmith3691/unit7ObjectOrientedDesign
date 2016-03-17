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
    public JPanel colorPanel;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        canvas1 = canvas;
        this.button = new JButton("Pick Color");
        add(button);
        
        colorPanel = new JPanel();
        colorPanel.setBackground(canvas1.getColor());
        add(colorPanel);
        
        this.button2 = new JButton("Add Circle");
        add(button2);
        
        this.button3 = new JButton("Add Square");
        add(button3);
        
        button.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
         }
        public void setColor()
        {
            this.canvas1.pickColor();
            
            //this.displayColor.setBackground(this.canvas1.getColor());
        }
        public void addCircle()
        {
            this.canvas1.addCircle();
        }
        public void addSquare()
        {
            //this.canvas1.addSquare();
        }
    public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
             if (event.getSource() == button)
             {
                setColor();
                
                colorPanel.setBackground(canvas1.getColor());
                }
             else if (event.getSource() == button2)
             {
                canvas1.addCircle();
                 System.out.println("Button1");
                }
             else if (event. getSource() == button3)
             {
                 addSquare();
                 System.out.println("Button2");
                }
    }
}
        ClickListener listener = new ClickListener();
}
