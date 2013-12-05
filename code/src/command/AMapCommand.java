package command;

import map.Map;

public abstract class AMapCommand extends ACommand{
		
	public abstract ACommand execute(Map m);
	
}
