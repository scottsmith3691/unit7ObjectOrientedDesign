
public class CallingCard extends Card
{
    String number;
    String pin;
    public CallingCard(String n, String num, String pin)
    {
        number = num;
        pin = pin;
    }
    
    public String format()
    {
        return "Calling Card Number: " + number + "Calling Card PIN: " + pin; 
    }
}
