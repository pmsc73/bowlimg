package board;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Procedurally generates a game board.
 * @author Philip
 *
 */
public class BoardGenerator {
	
	// board which will be generated
	private static Board board;
	
	private static int playerCount;
	private static int size;
	private static Stack<Tile> tiles = new Stack<Tile>();
	
	public static Board generate(int size, int playerCount) {

		BoardGenerator.playerCount = playerCount;
		BoardGenerator.size = size;
		
		for(int i = 0; i < size; i++) {
			Tile tile = getNextTile();
		}

		return board;
	}
	
	private static Tile getNextTile() {
		int x = 0;
		int y = 0;
		int owner = 0;
		
		Tile next = new Tile(x, y);
		return next;
	}
	
	
}
