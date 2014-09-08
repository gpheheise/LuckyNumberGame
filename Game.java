
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
    
    private Player player = new Player();
    private LuckyNumberGenerator luckyNumberGenerator = new LuckyNumberGenerator();
	private boolean settedUp = false;
    
    protected void displayMenu ()
    {
        println("Welcome to the Guessing Game");
        println("============================");
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
            int ichoice = Integer.parseInt(schoice);
            options(ichoice);
        }
        catch (Exception e)
        {
            err();
        }
        finally
        {
            System.out.print("\n");
            displayMenu();
        }
    }
    private void println(String string) {
		System.out.println(string);
		
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
        else if (choice == 1)
        {
        	setUpPlayer();
        }
        else if (choice == 4)
        {
        	displayHelp();
        }
        else if (choice == 5)
        {
        	System.exit(0);
        }
        else if (!settedUp)
        {
        	println("Please set up the players first!");
        	setUpPlayer();
        }
        else if (choice == 3)
        {
        	displayPlayerStatistics();
        }
        else if (choice == 2)
        {
        	guessNumber();
        }
    }
    
    private void guessNumber() {
    	Scanner scanner = new Scanner(System.in);
    	
		for (int i = 1; i <= 3; i++) {
			print("Enter a number between 1-100 (up to 3 guesses) : ");
			String sinput = scanner.next();
			int iinput = Integer.parseInt(sinput);
			
			if (iinput < 1 || iinput > 100) return;
			
			if (iinput == luckyNumberGenerator.getLuckyNumber())
			{
				player.win();
				break;
			}
			else if (i == 3 && (iinput == (luckyNumberGenerator.getLuckyNumber() - 5) || iinput == (luckyNumberGenerator.getLuckyNumber() + 5)))
				player.consolation();
			else if (iinput > luckyNumberGenerator.getLuckyNumber()) 
			{}
				// number too high
			else if (iinput > luckyNumberGenerator.getLuckyNumber()) 
			{}
				// number too low
		}
	}
	private void print(String string) {
		System.out.print(string);
	}
	private void displayPlayerStatistics() {
		int wins = player.getWins();
		int loss = player.getLoss();
		float percentage = (float) wins / (float) (wins + loss);
		int winnings = player.getWinnings();
		
		println("Player ".concat(player.getName()).concat(" has ").concat(String.valueOf(wins)).concat(" win(s) and ").concat(String.valueOf(loss)).concat(" loss(es) ==> Winning Percentage = ").concat(String.valueOf(percentage)).concat("%."));
		println("Total Winnings: $".concat(String.valueOf(winnings)));
	}
	public void start()
    {
    	while (true)
    		displayMenu();
    }
    
    private void setUpPlayer ()
    {
//    	System.out.println("Do you want to start a new game: Y / N");
    	System.out.print("Enter name for player: ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        if (response.toLowerCase().equals("\n") || response.equals("")){
        	setUpPlayer();
        	return;
        }
        this.player = new Player(response);
        this.settedUp = true;
    }
}
