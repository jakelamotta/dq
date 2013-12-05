package command;

import java.util.Stack;

import communication.Communications;
import player.*;
import map.Directions;
import map.Map;


public class GameStateHandler {
	public static final int MAXPLAYERS = 10;
	private final Map _m;
	private final PlayerHandler _p;
	private final Communications _i;
	private final Stack<ACommand> _commandStack;
	private boolean _victoryCondition;
	private int counter = 0;
	
	GameStateHandler() {
		//Set basic test values and add one player and one move to make
		_m = new Map(0,0,0);
                _p = new PlayerHandler();
                _i = new Communications();
		_victoryCondition = false;
                _commandStack = new Stack<>();
                
		_commandStack.push(new MoveCommand(Directions.NORTH));
		_commandStack.push(_i.addNewClient(null));
		_commandStack.push(_i.addNewClient(null));
	}
	
	/**
	 * PlayGame()
	 * Pre: All players have a hero.
	 */
	protected void PlayGame() {
		
		while(true) {
			if(_victoryCondition)
				break;
			ACommand c = _commandStack.pop();
			ACommand reply;
			if (c instanceof AMapCommand)
				reply = ((AMapCommand) c).execute(_m);
			else if (c instanceof ACommunicationCommand)
				reply = ((ACommunicationCommand) c).execute(_i);
			else if (c instanceof APlayerCommand)
				reply = ((APlayerCommand) c).execute(_p);
			else 
				reply = c.execute();
			if(reply != null){
				_commandStack.push(reply);
				System.out.println(reply.toString());
			}
			if(counter > 1) {
				this._victoryCondition = true;
			}
			counter++;
		}
		
	}
}
