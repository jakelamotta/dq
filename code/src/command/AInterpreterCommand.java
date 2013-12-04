package command;

import input.Interpreter;

public abstract class AInterpreterCommand extends ACommand {

	public abstract ACommand execute(Interpreter i);
	
}
