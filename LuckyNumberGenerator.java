
/**
 * Write a description of class LuckyNumberGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuckyNumberGenerator
{
    private int luckyNumberValue;
    
    public LuckyNumberGenerator()
    {
//        luckyNumberValue = 10; // For development purposes set to constant
        this.luckyNumberValue = this.generateLuckyNumber();
    }
    
    public int getLuckyNumber()
    {
        return luckyNumberValue;
    }
    
    public int generateLuckyNumber()
    {
        return luckyNumberValue = (int)(Math.random()*100) + 1;
    }
}
