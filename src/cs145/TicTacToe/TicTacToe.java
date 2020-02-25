package cs145.TicTacToe;

public class TicTacToe {

	private char currentPlayer;
	private char[] [] board;
	private char winner;
	
	public TicTacToe()
	{
		currentPlayer = 'X';
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				board[row][col] = ' ';
			}
		}
		winner = 'n';
	}
	public char getCurrentPlayer()
	{
		return currentPlayer;
	}
	public char getWinner()
	{
		return winner;
	}
	public boolean takeTurn(int row, int col)
	{
		if (!checkForWinner())
		{
			board[row][col] = currentPlayer;
			if (currentPlayer == 'X')
			{
				currentPlayer = 'O';
			}
			else if (currentPlayer == 'O')
			{
				currentPlayer = 'X';
			}
		}
		return true;
	}
	public boolean checkForWinner()
	{
		
		return false;
	}

}
