package command;

import player.Player;
import player.PlayerHandler;

public abstract class APlayerCommand extends ACommand {

	
	public abstract ACommand execute(PlayerHandler p);

}
