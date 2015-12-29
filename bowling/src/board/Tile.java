package board;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Representation of a single territory.
 * @author Philip
 *
 */
public class Tile {
	
	private int x;
	private int y;
	
	private int owner;
	
	// information about the units within the territory
	private Collection<Army> armies;

	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		this.owner = -1;
		this.armies = new ArrayList<Army>();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public Collection<Army> getArmies() {
		return armies;
	}

	public void setArmies(Collection<Army> armies) {
		this.armies = armies;
	}

}
