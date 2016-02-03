public class BillfoldTester
{
    public static void main(String[] args)
    {
        IDCard id = new IDCard("Scott","Hello");
        CallingCard cc = new CallingCard("Scott","Howryou", "supdawg");
        Billfold  test = new Billfold();
        test.addCard(id,cc);
        
        System.out.print(test.formatCards());
    }
    
}
