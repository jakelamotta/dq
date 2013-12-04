package command;

public abstract class ACommand {
	public int sentBy; // Debug?
	
	public ACommand execute() {
		return null;
	}
	
	public String toString() {
		return "Abstract Command: ";
	}
	
}
