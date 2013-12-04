package command;

import Player.Player;

public abstract class APlayerCommand extends ACommand {

	
	public abstract ACommand execute(Player p);

}
