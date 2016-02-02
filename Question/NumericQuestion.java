public class NumericQuestion extends Question
{
    private double answer;
    public void setAnswer(double correctAnswer)
    {
        this.answer = correctAnswer;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
}
