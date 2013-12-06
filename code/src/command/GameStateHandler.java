package command;

import java.util.Stack;

import communication.Communications;
import player.*;
import map.Directions;
import map.Map;


public class GameStateHandler {
	public static final int MAXPLAYERS = 10;
	protected static Map m;
	protected static PlayerHandler p;
	protected static Communications i;
	protected static Stack<ACommand> _commandStack;
	private boolean _victoryCondition;
	private int counter = 0;
	
	GameStateHandler() {
		//Set basic test values and add one player and one move to make
		m = new Map(0,0,0);
		p = new PlayerHandler();
		i = new Communications();
		_victoryCondition = false;
                _commandStack = new Stack<>();
                
		_commandStack.push(new MoveCommand(Directions.NORTH));
		_commandStack.push(i.addNewClient(null));
		_commandStack.push(i.addNewClient(null));
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

			reply = c.execute();
			if(reply == null)
				continue;

			_commandStack.push(reply);

			System.out.println(reply.toString());
			
			// Victory conditions for testing purposes.
			if(counter > 1) {
				this._victoryCondition = true;
			}
			counter++;
		}
		
	}
}
