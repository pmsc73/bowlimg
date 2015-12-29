package board;

import java.util.ArrayList;
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

	class Battle {
		for(Tile tile : tiles){
			ArrayList<Integer> casualties = new ArrayList<Integer>();
			for(Army army : tile.getArmies()) {

				// indexed by army.
				casualties.add(0);
			}

			for(int i = 0; i < tile.getArmies().size(); i++) {
				int kills = 0;
				for(int j=0; j<army.getSize();j++){
					//generate random roll
					if(roll >= 5){
						kills++;
					}
				}
				//Boolean suitableTargetExists = true;
				ArrayList<Army> suitableTargets = new ArrayList<Army>();
				for(Army newA : tile.getArmies()){
					suitableTargets.add(newA);
				}
				while((kills > 0)){ //&& (suitableTargets.size() != 0)){
					if(suitableTargets.size() == 0){
						winner = Army.getOwner();
						break;
					}
					else{
						for(Army newArmy : suitableTargets){
							if((newArmy.getSize() > 0) && newArmy.getOwner() != army.getOwner()){
								continue;
							}
							else{
								suitableTargets.remove(newArmy);
							}
						}
						//generate random selection of otherPlayer
						int otherPlayer = //....;
								casualties.set(otherPlayer, casualties.get(otherPlayer)+1);
						kills--;
					}
					//generate random selection of otherPlayer
					//otherPlayer.Army.getSize()--;
					//kills--;
				}
				/**if(suitableTargets.size() == 0){
						winner = Army.getOwner();
						break;
					}
					else{
						continue;
					}*/
			}
			for(Army army : tile.getArmies()) {
				army.setSize(army.getSize() - casualties.get(army.getOwner()));
			}
		}
	}
}
}
