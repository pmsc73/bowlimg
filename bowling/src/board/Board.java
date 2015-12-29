package board;

import java.util.Collection;

/**
 * Represents the state of the board, sure. POJO Yo
 * @author Philip
 *
 */

public class Board {
	// The territories
	private Collection<Tile> tiles;

	
	public Board(Collection<Tile> tiles) {
		this.tiles = tiles;
	}
	
	public Collection<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(Collection<Tile> tiles) {
		this.tiles = tiles;
	}
}
