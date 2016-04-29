
public class Test
{

    /**
     * Default constructor for objects of class Test
     */
    public static void main(String[] args)
    {
        int[] data = {1,3,5,4,2,7,77,8,9,5,3,5};
        System.out.println(thing(data));
        
    }
    public static boolean thing(int[] data)
    {
        for( int k =0; k < data.length; k++)
        {
            if(data[k] > data[k + 1])
            {
                return false;
            }
        }
        return true;
    }
}
