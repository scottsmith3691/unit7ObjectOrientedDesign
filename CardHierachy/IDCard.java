
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
    
    public boolean equals (IDCard other)
    {
        if(this.getClass() == other.getClass())
        {
            //since both objects are instances of IDCard. it is okay to cast other to an IDCard reference
            IDCard otheIDCard = (IDCard) other;
            
          boolean isEqual = super.equals(other);
          return isEqual && idNumber.equals(other.idNumber);
        }
        return false;
    }
}
