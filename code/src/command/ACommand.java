package command;

public abstract class ACommand {
	public int sentBy; // Debug?
	
	public ACommand execute() {
            return new NullCommand();
	}
	
	
}
