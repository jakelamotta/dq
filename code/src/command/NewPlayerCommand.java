package command;

import player.PlayerHandler;

public class NewPlayerCommand extends APlayerCommand {
	
	public NewPlayerCommand(int i){
		sentBy = i;
	}
	
	@Override
	public ACommand execute() {
		GameStateHandler.p.addPlayer(sentBy);
		System.out.println("Added player at index: "+ sentBy);
		return new NullCommand();
	}
}
