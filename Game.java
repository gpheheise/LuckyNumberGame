
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.Scanner;

public class Game
{
    
    private Player[] player = new Player[];
    private LuckyNumberGenerator luckyNumberGenerator = new LuckyNumberGenerator();
    
    protected void displayMenu ()
    {
        println("Welcome to the Guessing Game");
        println(============================");
        println("(1) Change (or Set Up) New Player");
        println("(2) Play One Round");
        println("(3) Display Player Wins Statistics");
        println("(4) Display Game Help");
        println("(5) Exit Game");
        System.out.print("Choose an option : ");
        
        try
        {
            Scanner scanner = new Scanner(System.in);
            String schoice = scanner.next();
            int ichoice = Integer.parserInt(schoice)l
            options(ichoice);
        }
        catch (Exception e)
        {
            err();
        }
        finally
        {
            System.out.print("n\");
            displayMenu();
        }
    }
    private void displayHelp()
    {
        println("HELP MENU COMMING SOON");
    }
    private void err()
    {
        System.out.println("\nPlease enter a number between 1 and 5");
    }
    public Game()
    {
        
    }
        public static void main (String[] args)
    { 
        try 
        {
            new Game().start();
        } 
        catch (Exception e)
        {
            System.err.println(e);
        }
    }
    
    public void options(int choice)
    {
        if(choice < 1 || choice > 5)
        {
            err();
        }
        else
            if (choice == 1)
            {
                setUpPlayer
            }
        else
            if (choice == 4)
            {
                displayHelp();
            }
        else 
            if (choice == 5)
            {
                System.exit(0);
            }
        else 
            if (!settedUp)
           {
               println("Please set up the players first!");
               setUpPlayer();
            }
        else 
            if (choice == 3)
            {
                displayPlayerStatistics();
            }
        else 
            if (finished)
            {
                println("Game finished. You must start a new game");
            }
        else 
            if (choice ==2)
            {
                guessNumber();
            }
        }
    public void start()
    {
        displayMenu();
    }
    
    private void setUpPlayer
    {
        if (settedUp)
        {
            System.out.println("Do you want to start a new game: Y / N");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            if (responese.toLowerCase().equals("n"))reture;
        }
}
