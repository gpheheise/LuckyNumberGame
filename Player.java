
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
        this.guess= 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    /**probably the 5$ thingy has to go into here aswell??
     */
     
}
