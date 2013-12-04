package command;

import map.Map;

public class MoveCommand extends AMapCommand {
	int direction;
	
	public ACommand execute(Map m) {
		//Map.action().....
		return null;
	}
	
	public String toString() {
		return "Move Command: ";
	}
}
