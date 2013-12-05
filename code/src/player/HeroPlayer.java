package player;

import command.ACommand;
import command.NullCommand;

public class HeroPlayer extends Player {

	private Hero _hero;
	
	public HeroPlayer() {
		
	}
	
	public ACommand action(ACommand pc) {
		return new NullCommand();
	}
	
	public void setHero(Hero h) {
		_hero = h;
	}
	
}
