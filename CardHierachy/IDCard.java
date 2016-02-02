
public class IDCard extends Card

{
    String idNumber;
    public IDCard(String n, String id)
    {
        super(n);
        idNumber=id;
    }
    public String format()
    {
        return "ID Card Number: " + idNumber;
    }
}
