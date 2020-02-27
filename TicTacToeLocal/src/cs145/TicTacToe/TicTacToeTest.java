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
		blankBoard.takeTurn(0, 0);
		blankBoard.takeTurn(2, 0);
		blankBoard.takeTurn(0, 1);
		blankBoard.takeTurn(2, 1);
		blankBoard.takeTurn(0, 2);
		assertTrue(blankBoard.checkForWinner());
		
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("+---------------+---------------+---------------+\n|\t \t|\t \t|\t \t|\n|---------------|---------------|---------------|\n|\t \t|\t \t|\t \t|\n|---------------|---------------|---------------|\n|\t \t|\t \t|\t \t|\n+---------------+---------------+---------------+", blankBoard.toString());
		blankBoard.takeTurn(0, 0);
		assertEquals("+---------------+---------------+---------------+\n|\tX\t|\t \t|\t \t|\n|---------------|---------------|---------------|\n|\t \t|\t \t|\t \t|\n|---------------|---------------|---------------|\n|\t \t|\t \t|\t \t|\n+---------------+---------------+---------------+", blankBoard.toString());
	}

}
