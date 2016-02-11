import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ClickListener implements ActionListener
{
    private String name;
    public ClickListener(String buttonName)
    {
        name = buttonName;
    }
    
    public void actionPerformed(ActionEvent event)
    {
             System.out.println("Button " + name + " was clicked");
    }
                
    }


