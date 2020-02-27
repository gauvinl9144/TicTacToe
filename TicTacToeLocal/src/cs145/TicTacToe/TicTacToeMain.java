package cs145.TicTacToe;
import java.util.Scanner;
public class TicTacToeMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToe! This program will allow you to electronically play TicTacToe with your friend as many times as you want.\nIf the winner declared is 'N', then the game is a tie.");
		boolean playAgain = true;
		boolean turn;
		
		int row;
		int col;
		char playOnceMore = 'y';
		Scanner input = new Scanner(System.in);
		
		while (playAgain)
		{
			System.out.println("Initializing board:\n");
			TicTacToe newGame = new TicTacToe();
			System.out.println(newGame.toString());
			System.out.println("Board has been initialized. Player X is the first player:\nWhich row would you like to go to?");
			row = input.nextInt() - 1;
			if (row < 0 || row > 2)
			{
				System.out.println("That row is invalid. Please input a number between 1 and 3.");
				row = input.nextInt() - 1;
			}
			System.out.println("\nWhich column would you like to go to?\n");
			col = input.nextInt() - 1;
			if (col < 0 || col > 2)
			{
				System.out.println("That column is invalid. Please input a number between 1 and 3.");
				col = input.nextInt() - 1;
			}
			turn = newGame.takeTurn(row, col);
			System.out.println(newGame.toString());
			while (turn)
			{
				System.out.println("Player " + newGame.getCurrentPlayer() + " is the next player:\nWhich row would you like to go to?");
				row = input.nextInt() - 1;
				if (row < 0 || row > 2)
				{
					System.out.println("That row is invalid. Please input a number between 1 and 3.");
					row = input.nextInt() - 1;
				}
				System.out.println("\nWhich column would you like to go to?\n");
				col = input.nextInt() - 1;
				if (col < 0 || col > 2)
				{
					System.out.println("That column is invalid. Please input a number between 1 and 3.");
					col = input.nextInt() - 1;
				}
				turn = newGame.takeTurn(row, col);
				System.out.println(newGame.toString());
			}
			System.out.println("Player " + newGame.getWinner() + " has won.\n\n");
			System.out.println("Would you like to play TicTacToe again?\nIf yes, type the character y. If no, type the character n.");
			playOnceMore = input.next().charAt(0);
			if (playOnceMore == 'n')
			{
				playAgain = false;
			}
				
		}
		System.out.println("Thank you for playing! Have a great day!");
		input.close();

	}

}
