package command;

import input.Interpreter;

public class ChooseHeroCommand extends AInterpreterCommand {

	ChooseHeroCommand(int sentby){
		sentBy = sentby;
	}
	
	public ACommand execute(Interpreter p) {
		return null;
	}

}
