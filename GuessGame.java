import java.util.Scanner;
import java.util.Random;
public class GuessGame
{
	public static void main(String args[])
	{
		Random prog = new Random();
		int key = prog.nextInt(100);
		
		Scanner game = new Scanner(System.in);
		
		boolean a = true;
		
		while(a == true)
		{
			System.out.println("I am a number between 0 to 100. \nGuess me. Which number am I? ");
			int num =  game.nextInt();
			
			if((num >= 0) && (num <= 100))
			{
			
				if(num > key)
				{
					System.out.println("Not a correct guess. I am smaller.\n");
				}
				else if(num < key)
				{
					System.out.println("Not a correct guess. I am bigger.\n");
				}
				else
				{
					System.out.println("Congratulations!!! You guessed me right. ");
					a = false;
				}
			}
			
			else
			{
				System.out.println("Not VALID! \nEnter a number between 0 and 100 (Including 0 and 100)\n\n\n");
			}
		}
	}
}