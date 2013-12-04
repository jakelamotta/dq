package card;

public class BattleCard extends Card {

	private int attackValue; //All the values here
	private int attackType; //All the values here
	
	public BattleCard() {
		name = "BattleCard";
	}
	
	public int getAttackValue() {
		return attackValue;
	}
	
	public int getAttackType() {
		return attackType;
	}
	
}
