public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    int first;
    int second;
    int third;
    int current;
    int count = 0;
    boolean correct1 = false;
    boolean correct2 = false;
    boolean correct3 = false;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        first = secret1;
        second = secret2; 
        third = secret3;
        current = 0;
    }

    public void reset()
    {
        current = 0;
    }
    
    public void turnRight(int ticks)
    {
        int sub = current-ticks;
        if( sub < 0)
        {
            current = 40 + sub;
            count++;
        }
        else
        {
            current = sub;
            count++;
        }
        if(current == first && count == 1)
        {
            correct1 = true;
        }
        if(current == third && count == 3)
        {
            correct1 = true;
        }
    }
    
    public void turnLeft(int ticks)
    {
        int sub = current+ticks;
        
        if( sub > 39)
        {
            current = sub - 40;
        }
        else
        {
            current = sub;
        }
        if(current == second && count == 2)
        {
            correct2 = true;
        }
    }
    
    public boolean open()
    {
         boolean isOpen = false;
        if(correct1 == true && correct2 == true && correct3 == true)
        {
           isOpen = true;
        }
        return isOpen;
    }

}
