package command;

import map.Directions;
import map.Map;

public class MoveCommand extends AMapCommand {
	private Directions direction;
	
	public MoveCommand(Directions dir){
		direction = dir;
	}
	
	public ACommand execute(Map m) {
		return m.move(direction);
	}

	@Override
	public ACommand execute() {
		// TODO Auto-generated method stub
		return null;
	}
}
