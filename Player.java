
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int guess;
    private int wins;
    private int loss;
    private int winnings;
    
    public String getName()
    {
        return this.name;
    }
    
    public int getGuess()
    {
        return this.guess;
    }
    public Player()
    {
        this("");
    }
    public Player(String name)
    {
        this.name = name;
        this.guess = 0;
        this.wins = 0;
        this.loss = 0;
        this.winnings = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getWins ()
    {
    	return wins;
    }
    
    public void raiseWins (int i)
    {
    	wins += i;
    }
    
    public int getLoss ()
    {
    	return loss;
    }
    
    public void raiseLoss (int i)
    {
    	loss += i;
    }
    
    public int getWinnings ()
    {
    	return this.winnings;
    }
    
    public void raiseWinnings (int i)
    {
    	this.winnings += i;
    }
    
    public void win ()
    {
    	this.raiseWins(1);
    	this.raiseWinnings(10);
    }
    
    public void loss()
    {
    	this.raiseLoss(1);
    }
    
    public void consolation()
    {
    	this.raiseLoss(1);
    	this.raiseWinnings(5);
    }
     
}
