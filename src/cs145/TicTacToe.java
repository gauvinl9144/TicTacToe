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
		winner = ' ';
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
			if (board[row][col] == ' ')
			{
				board[row][col] = currentPlayer;
				if (!checkForWinner())
				{
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
			System.out.println("This spot has already been taken. Please pick another.");
		}
		return false;
		
	}
	public boolean checkForWinner()
	{
		if (winner == ' ')
		{
			int i = 1;
				switch(i)
				
				case 1:
					if ((board[0][0] && board[0][1] && board[0][2]) == currentPlayer)
					{
						return true;
					}
				case 2:
					if ((board[1][0] && board[1][1] && board[1][2]) == currentPlayer)
						{
						return true;
						}
				case 3:
					if ((board[2][0] && board[2][1] && board[2][2]) == currentPlayer)
					{
						return true;
					}
				case 4:
					if ((board[0][0] && board[1][0] && board[2][0]) == currentPlayer)
					{
						return true;
					}
				case 5:
					if ((board[0][1] && board[1][1] && board[2][1]) == currentPlayer)
					{
						return true;
					}
				case 6:
					if ((board[0][2] && board[1][2] && board[2][2]) == currentPlayer)
					{
						return true;
					}
				case 7:
					if ((board[0][0] && board[1][1] && board[2][2]) == currentPlayer)
					{
						return true;
					}
				case 8:
					if ((board[2][0] && board[1][1] && board[0][2]) == currentPlayer)
					{
						return true;
					}
					break;
			}
		}
		return false;
	}
	public String toString()
	{
		String returnline = ("+-+-+-+\n|") + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|\n|-|-|-|\n|" + board[1][0] + "|" + board[1][1] + "|";
		returnline += board[1][2] + "|\n|-|-|-|\n|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|\n+-+-+-+";
		return returnline;
	}

}
