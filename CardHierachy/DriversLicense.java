
public class DriversLicense extends Card

{
    int expiration;
    public DriversLicense(String n,int exp)
    {
        super(n);
        expiration=exp;
    }
    public String format()
    {
        return "Drivers License Expiration Date: " + expiration;
    }

}
