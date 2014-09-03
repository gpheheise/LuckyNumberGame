
/**
 * Write a description of class LuckyNumberGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuckyNumberGenerator
{
    private int luckyNumberValue;
    
    public LuckyNumberGenerator() // would love to call that LuckyNumber . . . cant i call the class LuckyNumber??
    {
        luckyNumberValue =1;
    }
    
    public int getLuckyNumberGenerator()
    {
        return luckyNumberValue;
    }
    
    public int generateLuckyNumberGenerator()
    {
        return luckyNumberValue = (int)(Math.random()*100) + 1;
    }
    
    public void setLuckyNumberGenerator (int value)
    {
        luckyNumberValue = value;
    }
   
}
