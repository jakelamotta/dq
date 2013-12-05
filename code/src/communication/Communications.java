package communication;

import command.ACommand;
import command.GameStateHandler;
import command.NewPlayerCommand;


public class Communications {
	private ClientInterface[] _cl;
	private int counter = 0;
	
	public Communications(){
            _cl = new ClientInterface[GameStateHandler.MAXPLAYERS];
        }
	
	public ACommand addNewClient(ClientInterface i){
		_cl[counter] = i;
		return new NewPlayerCommand(counter++);
	}

}
