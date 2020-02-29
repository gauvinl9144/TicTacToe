/**
 * 
 */
package cs145.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author GauvinLuke
 *
 */
class TicTacToeTest {

	TicTacToe blankBoard = new TicTacToe();
	TicTacToe board1 = new TicTacToe();
	TicTacToe board2 = new TicTacToe();
	TicTacToe board3 = new TicTacToe();
	TicTacToe board4 = new TicTacToe();
	TicTacToe board5 = new TicTacToe();
	TicTacToe board6 = new TicTacToe();
	TicTacToe board7 = new TicTacToe();
	TicTacToe board8 = new TicTacToe();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#TicTacToe()}.
	 */
	@Test
	void testTicTacToe() {
		for(int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				
			}
		}
		assertEquals(' ', blankBoard.getWinner());
		assertEquals('X', blankBoard.getCurrentPlayer());
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#getCurrentPlayer()}.
	 */
	@Test
	void testGetCurrentPlayer() {
		assertEquals('X', blankBoard.getCurrentPlayer());
		blankBoard.takeTurn(0, 0);
		assertEquals('O', blankBoard.getCurrentPlayer());
		blankBoard.takeTurn(2, 0);
		assertEquals('X', blankBoard.getCurrentPlayer());
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#getWinner()}.
	 */
	@Test
	void testGetWinner() {
		blankBoard.takeTurn(0, 0);
		blankBoard.takeTurn(2, 0);
		blankBoard.takeTurn(0, 1);
		blankBoard.takeTurn(2, 1);
		blankBoard.takeTurn(0, 2);
		assertEquals('X', blankBoard.getWinner());
		
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#takeTurn(int, int)}.
	 */
	@Test
	void testTakeTurn() {
		assertEquals('X', blankBoard.getCurrentPlayer());
		assertTrue(blankBoard.takeTurn(0, 0));
		assertEquals('O', blankBoard.getCurrentPlayer());
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#checkForWinner()}.
	 */
	@Test
	void testCheckForWinner() {
		assertTrue(!blankBoard.checkForWinner());
		for (int col = 0; col < 3; col++)
		{
			blankBoard.takeTurn(0, col);
			blankBoard.takeTurn(1, col);
			board1.takeTurn(1, col);
			board1.takeTurn(2, col);
			board2.takeTurn(2, col);
			board2.takeTurn(1, col);
			board3.takeTurn(col, 0);
			board3.takeTurn(col, 1);
			board4.takeTurn(col, 1);
			board4.takeTurn(col, 2);
			board5.takeTurn(col, 2);
			board5.takeTurn(col, 1);
			board6.takeTurn(col, col);
			board6.takeTurn(2, col);
			board7.takeTurn((2-col), col);
			board7.takeTurn(0, col);
		}
		assertTrue(blankBoard.checkForWinner());
		assertTrue(board1.checkForWinner());
		assertTrue(board2.checkForWinner());
		assertEquals('X', blankBoard.getWinner());
		assertEquals('X', board1.getWinner());
		assertEquals('X', board2.getWinner());
		assertTrue(board3.checkForWinner());
		assertTrue(board4.checkForWinner());
		assertTrue(board5.checkForWinner());
		assertEquals('X', board3.getWinner());
		assertEquals('X', board4.getWinner());
		assertEquals('X', board5.getWinner());
		assertTrue(board6.checkForWinner());
		assertTrue(board7.checkForWinner());
		assertEquals('X', board6.getWinner());
		assertEquals('X', board7.getWinner());
		board8.takeTurn(0, 0);
		board8.takeTurn(1, 0);
		board8.takeTurn(0, 1);
		board8.takeTurn(1, 1);
		board8.takeTurn(1, 2);
		board8.takeTurn(0, 2);
		board8.takeTurn(2, 0);
		board8.takeTurn(2, 2);
		board8.takeTurn(2, 1);
		assertTrue(board8.checkForWinner());
		assertEquals('N', board8.getWinner());
	
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("+---+---+---+\n|   |   |   |\n|---|---|---|\n|   |   |   |\n|---|---|---|\n|   |   |   |\n+---+---+---+", blankBoard.toString());
		blankBoard.takeTurn(0, 0);
		assertEquals("+---+---+---+\n| X |   |   |\n|---|---|---|\n|   |   |   |\n|---|---|---|\n|   |   |   |\n+---+---+---+", blankBoard.toString());
	}

}
