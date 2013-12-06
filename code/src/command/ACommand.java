package command;

public abstract class ACommand {
	public int sentBy; // Debug?
	
	//Currently this method needs to be implemented for the code to run as all subclasses
	//dont provide an implementation
	public ACommand execute() {
           return null;
	}
	
	
}
