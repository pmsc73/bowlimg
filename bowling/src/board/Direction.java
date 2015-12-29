package board;

public enum Direction {
	NONE( 0, 0, 0, 0),
	NE	( 1,-1, 0,-1),
	E	( 1, 0, 1, 0),
	SE	( 1, 1, 0, 1),
	SW	( 0, 1,-1, 1),
	W	(-1, 0,-1, 0),
	NW	( 0,-1,-1,-1);

	private int evenXOffset;
	private int evenYOffset;
	private int oddXOffset;
	private int oddYOffset;

	private Direction(int evenXOffset, int evenYOffset, int oddXOffset, int oddYOffset) { 
		this.evenXOffset = evenXOffset;
		this.evenYOffset = evenYOffset;
		this.oddXOffset = oddXOffset;
		this.oddYOffset = oddYOffset;
		
	}
	
	/**
	 * Generate a random direction.
	 * @return a Direction not equal to <tt>Direction.NONE</tt>
	 */
	public static Direction randomDirection() {
		return Direction.values()[(int)(Math.random() * (Direction.values().length - 1) + 1)];
	}

	public int getXOffset(boolean even) {
		return even ? evenXOffset : oddXOffset;
	}

	public int getYOffset(boolean even) {
		return even ? evenYOffset : oddYOffset;
	}
}
