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
	private static ArrayList<Integer> assignedTiles;
	private static int size;
	private static Stack<Tile> tiles = new Stack<Tile>();

	public static Board generate(int size, int playerCount) {
		
		BoardGenerator.playerCount = playerCount;
		BoardGenerator.size = size;
		BoardGenerator.assignedTiles = new ArrayList<Integer>(playerCount);
		
		for(int p = 0; p < playerCount; p++) {
			
			// initialize the number of assigned tiles for each player to zero
			assignedTiles.set(p, 0);
		}
		
		while(tiles.size() < size) {
			pushNextTile();
			
		}
		board = new Board(tiles);
		return board;
	}

	/**
	 * Determines what the next tile will be, and pushes it to <tt>tiles</tt>
	 */
	private static void pushNextTile() {
		// setting up initial tile, for when tiles is empty.
		int x = 0;
		int y = 0;
		int owner = (int)(Math.random() * playerCount);
		Tile next = new Tile(x,y,owner);

		if(!tiles.isEmpty()) {
			
			//XXX better way to do this?
			// find a suitable owner (one who doesn't have their quota of assigned tiles)
			while(assignedTiles.get(owner) >= size/playerCount) {
				owner = (int)(Math.random() * playerCount);
			}
			// get the last tile to determine next coords
			Tile last = tiles.pop();

			Direction dir = Direction.randomDirection();

			x = last.getX(); // start from the last X position
			y = last.getY(); // start from the last Y position

			// whether the last tile was on an "even" or "odd" row
			boolean even = (y % 2 == 0);
			
			// get the next x and y based on Directional offset
			next.setX(x + dir.getXOffset(even));
			next.setY(y + dir.getYOffset(even));
			
			tiles.push(last);
			
		}
		tiles.push(isTileAssigned(next));
	}


	/**
	 * Checks if a tile has already been assigned, and returns the previous
	 * assigned one if it has, and the parameter tile otherwise.
	 * @return
	 */
	private static Tile isTileAssigned(Tile t) {
		for(Tile tile : tiles) {
			if(tile.getX() == t.getX() && tile.getY() == t.getY()) {
				tiles.remove(tile);
				return tile;
			}
		}
		return t;
	}
}
