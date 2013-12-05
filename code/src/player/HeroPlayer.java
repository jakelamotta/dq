package player;

import command.ACommand;

public class HeroPlayer extends Player {

	private Hero _hero;
	
	public HeroPlayer() {
		
	}
	
	public ACommand action(ACommand pc) {
		return null;
	}
	
	public void setHero(Hero h) {
		_hero = h;
	}
	
}
