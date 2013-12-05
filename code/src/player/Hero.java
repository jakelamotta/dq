package player;

import card.PowerCard;
import java.util.ArrayList;

public class Hero {

	private int HP;
	private int Dexterity;
	private int Strength;
	private int Luck;
	private ArrayList<PowerCard> powerCards;
        
        public Hero(int hp, int d, int s, int l, ArrayList<PowerCard> pc){
            HP = hp;
            Dexterity = d;
            Strength = s;
            Luck = l;
            powerCards = pc;
        }
        
        public Hero(){
            this(0,0,0,0,null);
        }
	
}
