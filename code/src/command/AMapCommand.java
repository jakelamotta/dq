package command;

import map.Map;

public abstract class AMapCommand extends ACommand{
	
	public String toString() {
		return "Abstract Map Command: ";
	}
	
	public abstract ACommand execute(Map m);
	
}
