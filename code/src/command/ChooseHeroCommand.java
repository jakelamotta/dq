package command;

import communication.Communications;

public class ChooseHeroCommand extends ACommunicationCommand {

	ChooseHeroCommand(int sentby){
		sentBy = sentby;
	}
	
	public ACommand execute() {
		return new NullCommand();
	}

}
