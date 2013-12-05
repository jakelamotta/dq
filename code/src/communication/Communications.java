package communication;

import java.util.ArrayList;

import command.ACommand;
import command.GameStateHandler;
import command.NewPlayerCommand;


public class Communications {
	private ClientInterface[] _cl = new ClientInterface[GameStateHandler.MAXPLAYERS];
	private int counter = 0;
	
	public Communications(){
		}
	
	public ACommand addNewClient(ClientInterface i){
		_cl[counter] = i;
		return new NewPlayerCommand(counter++);
	}

}
