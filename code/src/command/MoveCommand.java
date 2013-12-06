package command;

import map.Directions;
import map.Map;

public class MoveCommand extends AMapCommand {
	private Directions direction;
	
	public MoveCommand(Directions dir){
		direction = dir;
	}
	
	public ACommand execute() {
		return GameStateHandler.m.move(direction);
	}

}
