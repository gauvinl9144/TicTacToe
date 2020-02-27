package cs145.TicTacToe;

public class TicTacToe {
	
		private char currentPlayer;
		private char[] [] board;
		private char winner;
		/**
		 * This is the constructor method for TicTacToe, initializing the game with a 3x3 board filled with spaces, a winner that is a space, and a currentPlayer 'X'
		 */
		public TicTacToe()
		{
			board = new char[3][3];
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
		/**
		 * Function to return the character stored in currentPlayer
		 * @return the currentPlayer
		 */
		public char getCurrentPlayer()
		{
			return currentPlayer;
		}
		/**
		 * Function to return the character stored in winner
		 * @return the winner
		 */
		public char getWinner()
		{
			return winner;
		}
		/**
		 * Function takes in row and column, checks to see if a winner has been chosen (and if it has returns false)
		 * and if not it ensures that the spot chosen by inputs is a space. If that spot is a space, it will first
		 * make that spot be the currentPlayer. It will then check again to see if there is a winner; if there
		 * is, it will return false so that the program can jump out of the takeTurn loop, but if there isn't,
		 * it will swap players and return true in order to stay in the loop.
		 * 
		 * If the spot, however, is already taken by a player, it will print a message indicating
		 * the spot is full and will return true so that the main can again run through and allow
		 * a new spot to be chosen.
		 * @param row is the row the currentPlayer wants to occupy
		 * @param col is the column the currentPlayer wants to occupy
		 * @return a true or false based on if the game should even still be running or not (false
		 * if it shouldn't, true if it should)
		 */
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
						return true;
					}
					else
					{
						return false;
					}
					
				}
				System.out.println("This spot has already been taken. Please pick another.");
				return true;
			}
			
			return false;
			
		}
		/**
		 * This function checks if there really is a winner and if there isn't it goes through
		 * the eight different ways a player can win. If they have won in any of those ways, it
		 * returns true and assigns the winner to be the currentPlayer. If they haven't won, it
		 * will return false in order to keep the rest of the logic consistent
		 * It will also look to see if the winner isn't a space; if it isn't, then the boolean
		 * returns true. This is a safeguard in case the program somehow breaks.
		 * Then, if the winner variable is a space and no winner yet exists, it returns false to
		 * continue consistent logic.
		 * 
		 * Also, it checks the condition that the entire board has been filled. If this is the case,
		 * it declares the winner as N indicating that there was no winner.
		 * @return the true if a winner is chosen or false if a winner doesn't exist
		 */
		public boolean checkForWinner()
		{
			if (winner == ' ')
			{
				int i = 1;
					switch(i) 
					{
					
					case 1:
						if ((board[0][0] == currentPlayer) && (board[0][1] == currentPlayer) && (board[0][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 2:
						if ((board[1][0] == currentPlayer) && (board[1][1] == currentPlayer) && (board[1][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 3:
						if ((board[2][0] == currentPlayer) && (board[2][1] == currentPlayer) && (board[2][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 4:
						if ((board[0][0] == currentPlayer) && (board[1][0] == currentPlayer) && (board[2][0] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 5:
						if ((board[0][1] == currentPlayer) && (board[1][1] == currentPlayer) && (board[2][1] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 6:
						if ((board[0][2] == currentPlayer) && (board[1][2] == currentPlayer) && (board[2][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 7:
						if ((board[0][0] == currentPlayer) && (board[1][1] == currentPlayer) && (board[2][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 8:
						if ((board[2][0] == currentPlayer) && (board[1][1] == currentPlayer) && (board[0][2] == currentPlayer))
						{
							winner = currentPlayer;
							return true;
						}
					case 9:
						if (board[0][0] != ' ' && board[0][1] != ' '  && board[0][2] != ' '  && board[1][0] != ' '  && board[1][1] != ' '  && board[1][2] != ' '  && board[2][0] != ' ' && board[2][1] != ' '  && board[2][2] != ' ')
						{
							winner = 'N';
							return true;
						}
						break;
					}
				}
			else if (winner != ' ')
			{
				return true;
			}
			
			return false;
		}
		/**
		 * Makes the game into a readable board and returns it to be printed
		 */
		public String toString()
		{
			String returnline = ("+---------------+---------------+---------------+\n|\t") + board[0][0] + "\t|\t" + board[0][1];
			returnline += "\t|\t" + board[0][2] + "\t|\n|---------------|---------------|---------------|\n|\t" + board[1][0] + "\t|\t" + board[1][1] + "\t|\t";
			returnline += board[1][2] + "\t|\n|---------------|---------------|---------------|\n|\t" + board[2][0] + "\t|\t" + board[2][1];
			returnline += "\t|\t" + board[2][2] + "\t|\n+---------------+---------------+---------------+";
			return returnline;
		}

	}


