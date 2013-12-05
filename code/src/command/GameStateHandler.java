package command;

import java.util.Queue;
import java.util.Stack;

import communication.Communications;
import player.*;
import map.Directions;
import map.Map;


public class GameStateHandler {
	private Map _m;
	private PlayerHandler _p = new PlayerHandler();
	private Communications _i = new Communications();
	private Stack<ACommand> _commandStack = new Stack<ACommand>();
	private Boolean _victoryCondition;
	public static final int MAXPLAYERS = 10;
	int counter = 0;
	
	GameStateHandler() {
		//Set basic test values and add one player and one move to make
		_m = new Map(0,0,0);
		_victoryCondition = false;
		_commandStack.push(new MoveCommand(Directions.NORTH));
		_commandStack.push(_i.addNewClient(null));
		_commandStack.push(_i.addNewClient(null));
	}
	
	/**
	 * PlayGame()
	 * Pre: All players have a hero.
	 */
	public void PlayGame() {
		
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
