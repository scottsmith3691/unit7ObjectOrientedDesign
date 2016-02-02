import java.util.*;
public class FillInQuestion extends Question
{
    //override the setText method to extract the answer form the question text
    /* Example:
     * "The inventor of java was _James Gosling"
     * 
     * text: "The inventor of java was ______"
     * answer: "James Gosling"
     */
    public FillInQuestion()
    {
        Scanner parser = new Scanner(System.in);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question +="_____" +parser.next();
        
        //without super. it would infinitley call on itself 
        super.setText(question);
        this.setAnswer(answer);
        
    }
}
