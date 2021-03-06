package board;

public class Army {
	
	private Direction direction;
	
	// number of units in the army
	private int size;
	
	// owner of the army
	private int owner;
	
	public Army(int owner) {
		this.size = 1;
		this.owner = owner;
		this.direction = Direction.NONE;
	}
	
	/**
	 * Whether this army should get a defending bonus on it's roles. 
	 * Determined by whether or not the army was given an order to move.
	 * @return
	 */
	public boolean isDefender() {
		return direction == Direction.NONE;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}
	
}
