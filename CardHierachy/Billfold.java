
public class Billfold 
{
    Card card1;
    Card card2;
    public void addCard(Card firstCard, Card secondCard)
    {
        if(card1 != null)
        {
            System.out.print("No spots to fill");
        }
        else
        {
            card1 = firstCard;
        }
        if(card2 != null)
            {
                System.out.print("No spots to fill");
            }
        else
            {
                card2 = secondCard;
            }
    }
    
    public String formatCards()
    {
        return card1.format() + card2.format();
    }
    
}
